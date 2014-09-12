package actionsstruts;

import beansstruts.BeanTablon;

import controladores.ControladorNoticias;
import javax.servlet.http.*;
import logicaNegocio.Noticia;
import org.apache.struts.action.*;

public class ActionVerNoticia extends Action{
    
    public ActionForward execute(ActionMapping actionMapping, 
                                 ActionForm actionForm, 
                                 HttpServletRequest request, 
                                 HttpServletResponse response) throws Exception {
        
        BeanTablon bean = (BeanTablon)actionForm;
        Noticia noticia = ControladorNoticias.getInstancia().findNoticia(bean.getTituloSeleccionado());
        bean.setTitulo("");
        bean.setContenido("");
        bean.setAutor("");
        // noticia es un result bean
        request.setAttribute("noticia", noticia);
        return (actionMapping.findForward("verNoticia"));
    }
}
