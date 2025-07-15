import {Campista} from '../interfaces/Campista';

const API_URL = 'http://localhost:3001/campistas';

export async function obtenerCampistas(): Promise<Campista[]>{
    const respuesta = await fetch(API_URL);
    if (!respuesta.ok) throw new Error ('Error al obtener los campistas');
    return await respuesta.json();
}

export async function agregarCampista(campista: Campista): Promise<Campista[]>{
    const respuesta = await fetch(API_URL, {
        method: 'POST',
        headers: {'content-type': 'application/json'},
        body: JSON.stringify(campista),
    });
    if (!respuesta.ok) throw new Error ('Error al agregar el campistas');
    return await respuesta.json();
}