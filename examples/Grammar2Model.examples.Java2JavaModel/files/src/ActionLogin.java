package actionsstruts;

import beansstruts.BeanLogin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ActionLogin extends Action {
    public ActionForward execute(ActionMapping actionMapping, 
                                 ActionForm actionForm, 
                                 HttpServletRequest request, 
                                 HttpServletResponse response) throws Exception {
        BeanLogin bean = (BeanLogin)actionForm;
        if (bean.getUsuario().equals("user") && bean.getClave().equals("user")) {
            System.out.println("Usuario logged-in");
        }
        request.getSession().setAttribute("usuario", "invitado");
        if (request.getSession().getAttribute("datosPublicacion") != null)
            return actionMapping.findForward("publicar");   
        else return actionMapping.findForward("exito");
    }
}
