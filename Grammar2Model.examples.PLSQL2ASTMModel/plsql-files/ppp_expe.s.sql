  /** 
  * Descripci�n.: <br /> 
  * Autor.......: Sinergia Tecnol�gica (rse04m), 18/01/2007 <br /> 
  * Fichero.....: $Source: /data/cvs/adaptech/operativa/construccion/gefe/src/ddl/pack/ppp_expe.s.sql,v $ <br /> 
  * Id..........: $Id: ppp_expe.s.sql,v 1.1 2007/01/24 09:47:21 rse04m Exp $ <br /> 
  * Version.....: $Revision: 1.1 $ <br /> 
  * Alta CVS....: $Author: rse04m $ <br /> 
  * Fecha.......: $Date: 2007/01/24 09:47:21 $ <br /> 
  */


CREATE OR REPLACE PACKAGE PPP_EXPE IS


  /** 
  * Version CVS de la especificaci�n.  
  *
  */ 
  SPEC_RCS_VERSION CONSTANT VARCHAR2(30) := '$Revision: 1.1 $';

  ------------------------------------------------------------------------------
  --               Funciones control de versiones                             --
  ------------------------------------------------------------------------------
  -- getSpecRCSRev ------------------------------------------------------------
  /** 
  * Proporciona la versi�n de RCS del SPEC de paquete. 
  * 
  * @return Versi�n de la especificaci�n. 
  */ 
  FUNCTION getSpecRCSRev RETURN VARCHAR2 ;
  PRAGMA RESTRICT_REFERENCES(getSpecRCSRev, RNDS, WNDS, WNPS);

  --  getBodyRCSRev ------------------------------------------------------------
  /** 
  * Proporciona la versi�n de RCS del BODY de paquete. 
  * 
  * @return Versi�n del body. 
  */ 
  FUNCTION getBodyRCSRev RETURN VARCHAR2 ;
  PRAGMA RESTRICT_REFERENCES(getBodyRCSRev, RNDS, WNDS, WNPS);



  --  existe ------------------------------------------------------------
  /** 
  * Comprueba la existencia de un registro. Identificado de 
  * forma �nica con los par�metros de la funci�n. Actualiza 
  * el estado interno del Package para que los campos de 
  * la misma pueda ser recuperado por medio de una llamada 
  * a las funciones de campo.  
  *
  * @param  nIdexpe_  ID autonum�rico de expediente de preselecci�n de profesores.
  * @return Devuelve si existe o no un registro con la clave 
  *         primaria que se le pasa como par�metro
  */ 
  FUNCTION existe( 
            nIdexpe_ PP_EXPE.NIDEXPE%TYPE ) 
  RETURN BOOLEAN;
  PRAGMA RESTRICT_REFERENCES(existe, WNDS, RNPS);


  --  dameRegistro ------------------------------------------------------------
  /** 
  * Funci�n que dada la clave primaria de una tabla o clave �ncia 
  * devuelve una variable del tipo registro de la tabla con los datos 
  * de dicha registro.  
  *
  * @param  nIdexpe_  ID autonum�rico de expediente de preselecci�n de profesores.
  * @return Devuelve un registro con los datos de la 
  *         tabla
  */ 
  FUNCTION rDameRegistro( 
            nIdexpe_ PP_EXPE.NIDEXPE%TYPE ) 
  RETURN PP_EXPE%ROWTYPE;
  PRAGMA RESTRICT_REFERENCES(rDameRegistro, WNDS, WNPS, RNPS);


  ------------------------------------------------------------------------------
  --               Funciones de recuperaci�n de campos                        --
  ------------------------------------------------------------------------------
  -- nIdexpe ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NIDEXPE del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NIDEXPE
  */ 
  FUNCTION nIdexpe RETURN PP_EXPE.NIDEXPE%TYPE;
  PRAGMA RESTRICT_REFERENCES(nIdexpe, WNDS, RNDS, WNPS);

  -- nIdcurso ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NIDCURSO del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NIDCURSO
  */ 
  FUNCTION nIdcurso RETURN PP_EXPE.NIDCURSO%TYPE;
  PRAGMA RESTRICT_REFERENCES(nIdcurso, WNDS, RNDS, WNPS);


  ------------------------------------------------------------------------------
  --               Funciones tiene hijos                                     --
  ------------------------------------------------------------------------------

  -- tienePp_expeprofesorado ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla Pp_expeprofesorado que aluden 
  * al registro de la tabla PP_EXPE identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  nidexpe_  ID autonum�rico de expediente de preselecci�n de profesores.
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tienePp_expeprofesorado(
            nidexpe_  PP_EXPE.NIDEXPE%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tienePp_expeprofesorado, RNPS, WNPS, WNDS);


  -- tieneHijos ------------------------------------------------------------
  /** 
  * Comprueba si tiene registros hijos asociados, para ello realizamos la  
  * llamada a cada una de las funciones tiene<tablaHija>. Cada vez que  
  * se cree una nueva tabla hija ser� necesario modificar el cuerpo de la  
  * funci�n y a�adir la nueva sentencia ELSIF con dicha llamada. Si no  
  * existen tablas hijas asociadas a la clave de la tabla solo devolver� FALSE  
  * 
  * @param  nIdexpe_ ID autonum�rico de expediente de preselecci�n de profesores.
  * @param  vTexto_ Par�metro de salida que indica donde se encuentran 
  *         los registros hijos.
  * @return Devuelve si tiene hijos
  */ 
  FUNCTION tieneHijos ( 
            nIdexpe_ PP_EXPE.NIDEXPE%TYPE,
            vTexto OUT VARCHAR2 ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneHijos, WNPS, WNDS);


  -- tieneHijos ------------------------------------------------------------
  /** 
  * Sobrecarga de la funci�n que no devuelve el texto  
  * @param  nIdexpe_ ID autonum�rico de expediente de preselecci�n de profesores.
  * @return Devuelve si tiene hijos
  */ 
  FUNCTION tieneHijos ( 
            nIdexpe_ PP_EXPE.NIDEXPE%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneHijos, WNPS, WNDS);


  -- vDondeTieneHijos ------------------------------------------------------------
  /** 
  * Funci�n que llama a tieneHijos y devuelve d�nde tiene los hijos.  
  * @param  nIdexpe_ ID autonum�rico de expediente de preselecci�n de profesores.
  * @return  Texto que indica d�nde tiene hijos 
  */ 
  FUNCTION vDondeTieneHijos ( 
            nIdexpe_ PP_EXPE.NIDEXPE%TYPE ) 
  RETURN VARCHAR2 ;
  PRAGMA RESTRICT_REFERENCES(vDondeTieneHijos, WNPS, WNDS);


  --  insertar ------------------------------------------------------------
  /** 
  * Inserta el registro que se le pasa como par�metro  
  *
  * @param  rPP_EXPE_ Registro que se va a insertar en la tabla
  */ 
  PROCEDURE insertar( rPP_EXPE_ PP_EXPE%ROWTYPE );
  PRAGMA RESTRICT_REFERENCES(insertar, RNPS, WNPS, RNDS);

  ------------------------------------------------------------------------------
  -- Funciones de envio de avisos en la tramitaci�n de preselecci�n profesores--
  ------------------------------------------------------------------------------

   --  enviaAvisoInicioPreseleccion(rse04m,18/01/2007)---------------------
  /** 
  * Funci�n que intentar� enviar un aviso generado por un la renuncia
  * a subvenci�n de un curso por parte de la entidad que lo impartir�.
  *
  * @param  vCodrem_       C�digo de usuario del remitente
  * @param  vUrgencia_     Tipo de urgencia del aviso
  * @param  vSistema_      Sistema de la plantilla del aviso
  * @param  vCodPlantilla_ C�digo de la plantilla del aviso
  * @param  dFeenvio_      fecha de envio del aviso
  * @param  nIdexpe_       Id de expediente que genera el aviso
  * @return <code>TRUE</code> si se ha enviado el aviso correctamente
  *         y <code>FALSE</code> en caso contrario.
  */ 
  FUNCTION enviaAvisoInicioPreseleccion( 
                                 vCodremi_  CO.AV_AVISO.VCODREMI%TYPE,
                                 dFeenvio_      CO.AV_AVISO.DFEENVIO%TYPE, 
                                 nIdexpe_       CO.AV_AVISO.NIDEXPE%TYPE )    
  RETURN BOOLEAN;

   --  enviaAvisoValidaPreseleccion(rse04m,18/07/2007)---------------------
  /** 
  * Funci�n que intentar� enviar un aviso generado por un la renuncia
  * a subvenci�n de un curso por parte de la entidad que lo impartir�.
  *
  * @param  vCodrem_       C�digo de usuario del remitente
  * @param  vUrgencia_     Tipo de urgencia del aviso
  * @param  vSistema_      Sistema de la plantilla del aviso
  * @param  vCodPlantilla_ C�digo de la plantilla del aviso
  * @param  dFeenvio_      fecha de envio del aviso
  * @param  nIdexpe_       Id de expediente que genera el aviso
  * @return <code>TRUE</code> si se ha enviado el aviso correctamente
  *         y <code>FALSE</code> en caso contrario.
  */ 
  FUNCTION enviaAvisoValidaPreseleccion( 
                                 vCodremi_  CO.AV_AVISO.VCODREMI%TYPE,
                                 dFeenvio_      CO.AV_AVISO.DFEENVIO%TYPE, 
                                 nIdexpe_       CO.AV_AVISO.NIDEXPE%TYPE )    
  RETURN BOOLEAN;

    --  eliminaAvisoInicioPreseleccion(rse04m,18/07/2007)---------------------
  /** 
  * Funci�n que intentar� eliminar un aviso generado por un la iniciaci�n de un
  * expediente de preselecci�n de profesores.
  *
  * @param  nIdexpe_       Id de expediente que genera el aviso
  * @return <code>TRUE</code> si se ha eliminado el aviso correctamente
  *         y <code>FALSE</code> en caso contrario.
  */ 
  FUNCTION eliminaAvisoInicioPreseleccion( nIdexpe_ CO.AV_AVISO.NIDEXPE%TYPE )    
  RETURN BOOLEAN;
    --  eliminaAvisoValidaPreseleccion(rse04m,18/07/2007)---------------------
  /** 
  * Funci�n que intentar� eliminar un aviso generado por un la validaci�n de un
  * expediente de preselecci�n de profesores.
  *
  * @param  nIdexpe_       Id de expediente que genera el aviso
  * @return <code>TRUE</code> si se ha eliminado el aviso correctamente
  *         y <code>FALSE</code> en caso contrario.
  */ 
  FUNCTION eliminaAvisoValidaPreseleccion( nIdexpe_ CO.AV_AVISO.NIDEXPE%TYPE )    
  RETURN BOOLEAN;

  ------------------------------------------------------------------------------
  -- Funciones para generar el nuevo id de expediente de preselecci�n         --
  ------------------------------------------------------------------------------
  --vDameCodProPreseleccion(RSE04M,18/01/2007)----------------------------------
  /** 
  * Funci�n que devuelve el c�digo de procedimiento de preselecci�n de 
  * profesores
  */ 
  FUNCTION vDameCodProPreseleccion  RETURN VARCHAR2 DETERMINISTIC;
  PRAGMA RESTRICT_REFERENCES(vDameCodProPreseleccion, WNPS, WNDS, RNDS, RNPS);

  -- nCreaExpedientePreseleccion (RSE04M,18/01/2007)----------------------------
  /** Funci�n que crea un expediente de renuncia llamando a la funci�n 
  * nCreaExpeEnEstadoInicial del paquete de CO PEp_Expe
  *
  * @param vCodUsua_in    Login del usuario que crea el expediente
  * @param dFecTraUsu_in  Fecha de trabajo a la que crear el expediente
  * @param vAfiExpe_in    C�digo de afijo.
  * @param nIdExpedOri_in Expediente origen.    
  * @param nNumExpe_out   N�mero de expediente reci�n creado.
  * @return Id del expediente reci�n creado
  */
  FUNCTION nCreaExpedientePreseleccion(
                      vCodUsua_in      CO.EP_EXPETRA.VCODUSUA%TYPE,
                      dFecTraUsu_in    CO.EP_EXPE.DFECAPER%TYPE,
                      nIdExpedOri_in  CO.EP_EXPE.NIDEXPEDORI%TYPE)
  RETURN PP_EXPE.NIDEXPE%TYPE;
   -- eliminaExpedientePreseleccionTec(RSE04M,19/01/2007)-----------------------
  /** Funci�n que da e baja un expediente de preselecci�n de profesores.
  *
  * @param nIdexpe_ Expediente a dar de baja.   
  * @return <ul>
  *             <li>TRUE - Si lo ha eliminado correctamente</li>
  *             <li>FALSE - Si no ha podido eliminarlo</li>
  *         </ul>
  */
  FUNCTION eliminaExpedientePreseleccion( nIdexpe_ PP_EXPE.NIDEXPE%TYPE )
  RETURN BOOLEAN;

  -- puedeEntidadEliminarPREP (rse04m,19/01/2007)-----------------------
  /**Funci�n que coprueba si una entidad puede eliminar expediente
  * de preselecci�n de profesores
  *
  * @param  nIdexpe_  id de expediente que se quiere eliminar
  * @return <ul>
  *           <li>TRUE - si puede</li>
  *           <li>FALSE - si no puede</li>
  *         </ul>
  */
  FUNCTION puedeEntidadEliminarPREP( nIdexpe_ PP_EXPE.NIDEXPE%TYPE )
  RETURN BOOLEAN;
  PRAGMA RESTRICT_REFERENCES( puedeEntidadEliminarPREP, WNDS );


   -- puedeEliminarPREP (rse04m,19/01/2007)-----------------------
  /**Funci�n que coprueba si eliminar expediente
  * de preselecci�n de profesores comprobando que esta en esado inicial
  *
  * @param  nIdexpe_  id de expediente que se quiere eliminar
  * @return <ul>
  *           <li>TRUE - si puede</li>
  *           <li>FALSE - si no puede</li>
  *         </ul>
  */
  FUNCTION puedeEliminarPREP( nIdexpe_ PP_EXPE.NIDEXPE%TYPE )
  RETURN BOOLEAN;
  PRAGMA RESTRICT_REFERENCES( puedeEliminarPREP, WNDS );

END;
