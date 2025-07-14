export async function obtenerCampistas() {
    return new Promise((resolve, reject)=> {
        setTimeout(async () => {
            try {
                const respuesta = await fetch('../campistas.json');
                const datos = await respuesta.json();
                resolve(datos);
            } catch (e){
                reject('Error al cargar los datos');
            }
        }, 800); //Aqui simulamos la latencia
    });
}