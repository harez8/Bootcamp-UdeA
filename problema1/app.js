//Evento de carga del DOM   
document.addEventListener('DOMContentLoaded', async () =>{
    try{
        //Realizar solicitud para obtener datos de campista.json
        const res = await fetch('campistas.json');

        //convertir respuesta a onjeto js
        const campistas = await res.json();

        //Invocar funcion de renderizado
        renderizarTabla(campistas);
    }catch(error){
        //Mostrar error en consola
        console.error('Error al cargar los datos.', error);

    }
});
function renderizarTabla(campistas){
    //Selecionar cuerpo de la tabla
    const tbody = document.querySelector('#tabla-campistas tbody');
    //Limpiar contenido previo de la tabla
    tbody.innerHTML = '';
    //Recorrer el arreglo de campistas y crear filas con c/u
    campistas.forEach(c =>{
        const fila = document.createElement('tr');
        //Ingresar el HTML para cada celda
        fila.innerHTML = `
        <td> ${c.id}</td>
        <td> ${c.nombre}</td>
        <td> ${c.documento}</td>
        <td> ${c.genero_nacimiento}</td>
        <td> ${c.activo}</td>   
        `;
        tbody.appendChild(fila);
    })
};