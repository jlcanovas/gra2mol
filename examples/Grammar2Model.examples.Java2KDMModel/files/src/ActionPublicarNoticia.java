package actionsstruts;

import beansstruts.BeanTablon;
import controladores.ControladorNoticias;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ActionPublicarNoticia extends Action {
    public ActionForward execute(ActionMapping actionMapping, 
                                 ActionForm actionForm, 
                                 HttpServletRequest request, 
                                 HttpServletResponse response) throws Exception {
        BeanTablon bean = (BeanTablon)actionForm;
        if (request.getSession().getAttribute("usuario") == null){
            request.getSession().setAttribute("datosPublicacion", bean);
            return (actionMapping.findForward("login"));
        }
        BeanTablon datos = (BeanTablon)request.getSession().getAttribute("datosPublicacion");
        if (datos != null){
            bean = datos;
            request.getSession().setAttribute("datosPublicacion", null);
        }
        ControladorNoticias.getInstancia().addNoticia(
            bean.getTitulo(),
            bean.getContenido(),
            bean.getAutor()
        );
        return (actionMapping.findForward("exito"));
    }
}
