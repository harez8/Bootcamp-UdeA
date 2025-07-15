import {obtenerCampistas} from './api/campistaApi.js';
import {Campista} from './interfaces/Campista.js';

function renderizarTabla(campistas: Campista[]){
    const tbody = document.querySelector("#tablaCampistas tbody");
    if(!tbody) return;
    
    tbody.innerHTML = '';
    campistas.forEach(c =>{
        const fila = document.createElement('tr');
        fila.innerHTML = `
        <td>${c.id}</td>
        <td>${c.nombre}</td>
        <td>${c.documento}</td>
        <td>${c.genero_nacimiento}</td>
        <td>${c.activo ? 'Si' : 'No'}</td>
        `;
        tbody.appendChild(fila);
    });
}
document.addEventListener('DOMContentLoaded', async () =>{
    try {
        const campistas = await obtenerCampistas();
        renderizarTabla(campistas);
    }catch (e){
        console.error('Error al cargar los datos: ', e);
    }
});

