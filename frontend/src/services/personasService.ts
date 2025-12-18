const API_URL = 'http://localhost:8080/personas';

export async function getAllPersonas() {
    const response = await fetch(API_URL);
    if (!response.ok) {
        throw new Error('Error al obtener personas');
    }
    return await response.json();
}

export async function createPersona(persona: { nombre: string, email: string }) {
    const response = await fetch(API_URL, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(persona)
    });
    if (!response.ok) {
        throw new Error('Error al crear persona');
    }
    return await response.json();
}

export async function deletePersona(id: number) {
    const response = await fetch(`${API_URL}/${id}`, {
        method: 'DELETE'
    });
    if (!response.ok) {
        throw new Error('Error al eliminar persona');
    }
}