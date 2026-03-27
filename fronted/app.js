const BASE_URL = "http://localhost:8080/system/api/v1";
let selectedChallengeId = null;

// --- CARGA DE RETOS ---
async function getChallenges() {
    try {
        const res = await fetch(`${BASE_URL}/challenge`);
        const challenges = await res.json();
        const container = document.getElementById("challenges-list");
        
        container.innerHTML = challenges.map(c => `
            <div class="challenge-card" onclick="selectChallenge(${c.id}, '${c.title}', ${c.points})" id="card-${c.id}">
                <h4 style="margin:0 0 10px 0">${c.title}</h4>
                <p style="font-size: 0.85rem; color: #64748b; margin-bottom: 15px;">${c.description}</p>
                <div style="font-size: 0.8rem; font-weight: 600;">⭐ ${c.points} pts</div>
            </div>
        `).join('');
    } catch (e) { showToast("Error al conectar con la API", "error"); }
}

// --- SELECCIONAR UN RETO (Panel Derecho) ---
function selectChallenge(id, title, points) {
    selectedChallengeId = id;
    
    // UI: Marcar seleccionado
    document.querySelectorAll('.challenge-card').forEach(c => c.classList.remove('selected'));
    document.getElementById(`card-${id}`).classList.add('selected');

    // UI: Mostrar panel
    document.getElementById("empty-state").style.display = "none";
    document.getElementById("challenge-detail-content").style.display = "block";
    
    document.getElementById("selected-title").innerText = title;
    document.getElementById("selected-points").innerText = `${points} pts`;

    getParticipants(id);
}

// --- OBTENER PARTICIPANTES DEL RETO ---
async function getParticipants(challengeId) {
    const listContainer = document.getElementById("participants-list");
    listContainer.innerHTML = "Cargando...";

    try {
        // Asumiendo que tu API tiene un endpoint para ver inscritos por reto
        // Si no lo tiene, este es el concepto:
        const res = await fetch(`${BASE_URL}/challenge/${challengeId}/participants`);
        const users = await res.json();

        if(users.length === 0) {
            listContainer.innerHTML = "<p style='font-size:0.9rem; color:gray;'>Nadie inscrito aún.</p>";
            return;
        }

        listContainer.innerHTML = users.map(u => `
            <div class="user-item">
                <div style="width:32px; height:32px; background:#e2e8f0; border-radius:50%; display:flex; align-items:center; justify-content:center; font-size:12px; font-weight:bold;">
                    ${u.username.substring(0,2).toUpperCase()}
                </div>
                <div>
                    <div style="font-weight:600; font-size:0.9rem;">${u.username}</div>
                    <div style="font-size:0.75rem; color:gray;">${u.points || 0} pts totales</div>
                </div>
            </div>
        `).join('');
    } catch (e) {
        listContainer.innerHTML = "<p style='color:red;'>Error al cargar participantes</p>";
    }
}

// --- INSCRIPCIÓN RÁPIDA ---
async function inscribirseRapido() {
    const userId = document.getElementById("quick-user-id").value;
    if(!userId || !selectedChallengeId) return showToast("Falta ID de usuario");

    try {
        const res = await fetch(`${BASE_URL}/challenge/${selectedChallengeId}/inscription/${userId}`, {
            method: "POST"
        });
        if (!res.ok) throw new Error();
        
        showToast("¡Te has inscrito! 🎉");
        getParticipants(selectedChallengeId); // Recargar lista
    } catch (e) {
        showToast("Error en la inscripción", "error");
    }
}

// --- UTILIDADES ---
function toggleModal(id) {
    const m = document.getElementById(id);
    m.style.display = (m.style.display === 'flex') ? 'none' : 'flex';
}

function showToast(msg) {
    const t = document.getElementById("toast");
    t.innerText = msg;
    t.style.display = "block";
    setTimeout(() => t.style.display = "none", 3000);
}

// Carga inicial
window.onload = () => {
    getChallenges();
    lucide.createIcons();
};