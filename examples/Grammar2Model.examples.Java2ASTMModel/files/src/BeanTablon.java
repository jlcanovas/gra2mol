package beansstruts;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.*;

public class BeanTablon extends ActionForm{

  private String tituloSeleccionado = "";
 
  private String titulo = "";
  private String contenido = "";
  private String autor = "";

  
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request){
      ActionErrors errores = new ActionErrors();
      if (isTituloNoValido(getTitulo())) 
        errores.add(ActionErrors.GLOBAL_ERROR, new ActionError("tablon.error"));
      return errores;
  }
  
  private boolean isTituloNoValido(String t){
      if (t.contains("$") || t.contains("#")) return true;
      return false;
  }
  
  //

    public void setTituloSeleccionado(String tituloSeleccionado) {
        this.tituloSeleccionado = tituloSeleccionado;
    }

    public String getTituloSeleccionado() {
        return tituloSeleccionado;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

}
