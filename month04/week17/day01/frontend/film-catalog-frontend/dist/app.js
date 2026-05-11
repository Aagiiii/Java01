"use strict";
const API_BASE = "http://localhost:8080";
function getEl(id) {
    const el = document.getElementById(id);
    if (!el)
        throw new Error(`Element #${id} not found`);
    return el;
}
function setStatus(message, isError = false) {
    const el = getEl("status");
    el.textContent = message;
    el.className = isError ? "error" : "";
}
async function fetchFilms(page = 1, size = 20) {
    const res = await fetch(`${API_BASE}/api/films?page=${page}&size=${size}`);
    if (!res.ok)
        throw new Error(`HTTP ${res.status}`);
    return res.json();
}
async function searchFilms(title) {
    const params = new URLSearchParams({ title });
    const res = await fetch(`${API_BASE}/api/films/search?${params}`);
    if (!res.ok)
        throw new Error(`HTTP ${res.status}`);
    return res.json();
}
// ── Render films → HTML ────────────────────────────────────────────────────
function renderFilms(films) {
    const container = getEl("film-list");
    if (films.length === 0) {
        container.innerHTML = "<p>Кино олдсонгүй.</p>";
        return;
    }
    container.innerHTML = films.map(film => `
        <div class="film-card">
            <span class="rating">${film.rating}</span>
            <strong>${film.title}</strong>
            <span class="price">$${film.rental_rate.toFixed(2)}</span>
        </div>
    `).join("");
}
// ── Event handlers ─────────────────────────────────────────────────────────
getEl("btn-load").addEventListener("click", async () => {
    setStatus("Loading...");
    try {
        const films = await fetchFilms();
        renderFilms(films);
        setStatus(`${films.length} кино ачааллав.`);
    }
    catch (err) {
        setStatus(`Алдаа: ${err}`, true);
    }
});
getEl("btn-search").addEventListener("click", async () => {
    const input = getEl("input-search");
    const title = input.value.trim();
    if (!title)
        return;
    setStatus("Хайж байна...");
    try {
        const films = await searchFilms(title);
        renderFilms(films);
        setStatus(`"${title}" хайлтаар ${films.length} кино олдов.`);
    }
    catch (err) {
        setStatus(`Алдаа: ${err}`, true);
    }
});
