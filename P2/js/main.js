import	{obtenerCampistas} from './dataService.js';
import	{mostrarCampistas} from './uiController.js';

document.addEventListener('DOMContentLoaded', async ()=>{
    try {
        const datos = await obtenerCampistas();
        mostrarCampistas(datos);
    }catch (er){
        console.error('Error', err);
    }
});