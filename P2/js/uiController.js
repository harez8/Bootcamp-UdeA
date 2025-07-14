export function mostrarCampistas(campistas){
    const tbody = document.querySelector('#tabla-campistas tbody');
    tbody.innerHTML = '';

    campistas.forEach(c=> {
        const fila = document.createElement('tr');
        fila.innerHTML =`
        <td> ${c.id}</td>
        <td> ${c.nombre}</td>
        <td> ${c.documento}</td>
        <td> ${c.genero_nacimiento}</td>
        <td> ${c.activo ? '🟢':'🔴'}</td>   
        `;
        tbody.appendChild(fila);
    });
}