  /** 
  * Descripci�n.: <br /> 
  * Autor.......: Sinergia Tecnol�gica (rse04m), 27/06/2006 <br /> 
  * Fichero.....: $Source: /data/cvs/adaptech/operativa/construccion/gefe/src/ddl/pack/pen_entidad.s.sql,v $ <br /> 
  * Id..........: $Id: pen_entidad.s.sql,v 1.11 2006/10/16 08:45:53 gem02l Exp $ <br /> 
  * Version.....: $Revision: 1.11 $ <br /> 
  * Alta CVS....: $Author: gem02l $ <br /> 
  * Fecha.......: $Date: 2006/10/16 08:45:53 $ <br /> 
  */


CREATE OR REPLACE PACKAGE PEN_ENTIDAD IS


  /** 
  * Version CVS de la especificaci�n.  
  *
  */ 
  SPEC_RCS_VERSION CONSTANT VARCHAR2(30) := '$Revision: 1.11 $';

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
  * @param  nCodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no un registro con la clave 
  *         primaria que se le pasa como par�metro
  */ 
  FUNCTION existe( 
            nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN;
  PRAGMA RESTRICT_REFERENCES(existe, WNDS, RNPS);


  --  existe ------------------------------------------------------------
  /** 
  * Comprueba la existencia de un registro. Identificado de 
  * forma �nica con los par�metros de la funci�n. Actualiza 
  * el estado interno del Package para que los campos de 
  * la misma pueda ser recuperado por medio de una llamada 
  * a las funciones de campo.  
  *
  * @param  vEntidad_  C�digo de entidad. Es �nico y es lo que reconocen los usuarios.
  * @return Devuelve si existe o no un registro con la clave 
  *         primaria que se le pasa como par�metro
  */ 
  FUNCTION existe( 
            vEntidad_ EN_ENTIDAD.VENTIDAD%TYPE ) 
  RETURN BOOLEAN;
  PRAGMA RESTRICT_REFERENCES(existe, WNDS, RNPS);


  --  dameRegistro ------------------------------------------------------------
  /** 
  * Funci�n que dada la clave primaria de una tabla o clave �ncia 
  * devuelve una variable del tipo registro de la tabla con los datos 
  * de dicha registro.  
  *
  * @param  nCodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve un registro con los datos de la 
  *         tabla
  */ 
  FUNCTION rDameRegistro( 
            nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) RETURN EN_ENTIDAD%ROWTYPE;
  PRAGMA RESTRICT_REFERENCES(rDameRegistro, WNDS, RNPS);


  --  dameRegistro ------------------------------------------------------------
  /** 
  * Funci�n que dada la clave primaria de una tabla o clave �ncia 
  * devuelve una variable del tipo registro de la tabla con los datos 
  * de dicha registro.  
  *
  * @param  vEntidad_  C�digo de entidad. Es �nico y es lo que reconocen los usuarios.
  * @return Devuelve un registro con los datos de la 
  *         tabla
  */ 
  FUNCTION rDameRegistro( 
            vEntidad_ EN_ENTIDAD.VENTIDAD%TYPE ) 
  RETURN EN_ENTIDAD%ROWTYPE;
  PRAGMA RESTRICT_REFERENCES(rDameRegistro, WNDS, WNPS, RNPS);


  ------------------------------------------------------------------------------
  --               Funciones de recuperaci�n de campos                        --
  ------------------------------------------------------------------------------
  -- nCodenti ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NCODENTI del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NCODENTI
  */ 
  FUNCTION nCodenti RETURN EN_ENTIDAD.NCODENTI%TYPE;
  PRAGMA RESTRICT_REFERENCES(nCodenti, WNDS, RNDS, WNPS);

  -- vEntidad ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo VENTIDAD del registro interno del paquete  
  *
  * @return Devuelve el valor del campo VENTIDAD
  */ 
  FUNCTION vEntidad RETURN EN_ENTIDAD.VENTIDAD%TYPE;
  PRAGMA RESTRICT_REFERENCES(vEntidad, WNDS, RNDS, WNPS);

  -- vCif ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo VCIF del registro interno del paquete  
  *
  * @return Devuelve el valor del campo VCIF
  */ 
  FUNCTION vCif RETURN EN_ENTIDAD.VCIF%TYPE;
  PRAGMA RESTRICT_REFERENCES(vCif, WNDS, RNDS, WNPS);

  -- vRazon ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo VRAZON del registro interno del paquete  
  *
  * @return Devuelve el valor del campo VRAZON
  */ 
  FUNCTION vRazon RETURN EN_ENTIDAD.VRAZON%TYPE;
  PRAGMA RESTRICT_REFERENCES(vRazon, WNDS, RNDS, WNPS);

  -- vEmail ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo VEMAIL del registro interno del paquete  
  *
  * @return Devuelve el valor del campo VEMAIL
  */ 
  FUNCTION vEmail RETURN EN_ENTIDAD.VEMAIL%TYPE;
  PRAGMA RESTRICT_REFERENCES(vEmail, WNDS, RNDS, WNPS);

  -- nTipo ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NTIPO del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NTIPO
  */ 
  FUNCTION nTipo RETURN EN_ENTIDAD.NTIPO%TYPE;
  PRAGMA RESTRICT_REFERENCES(nTipo, WNDS, RNDS, WNPS);

  -- bCalidad ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BCALIDAD del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BCALIDAD
  */ 
  FUNCTION bCalidad RETURN EN_ENTIDAD.BCALIDAD%TYPE;
  PRAGMA RESTRICT_REFERENCES(bCalidad, WNDS, RNDS, WNPS);

 
  -- vObserva ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo VOBSERVA del registro interno del paquete  
  *
  * @return Devuelve el valor del campo VOBSERVA
  */ 
  FUNCTION vObserva RETURN EN_ENTIDAD.VOBSERVA%TYPE;
  PRAGMA RESTRICT_REFERENCES(vObserva, WNDS, RNDS, WNPS);

  -- dFecbaja ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo DFECBAJA del registro interno del paquete  
  *
  * @return Devuelve el valor del campo DFECBAJA
  */ 
  FUNCTION dFecbaja RETURN EN_ENTIDAD.DFECBAJA%TYPE;
  PRAGMA RESTRICT_REFERENCES(dFecbaja, WNDS, RNDS, WNPS);

  -- bCombien ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BCOMBIEN del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BCOMBIEN
  */ 
  FUNCTION bCombien RETURN EN_ENTIDAD.BCOMBIEN%TYPE;
  PRAGMA RESTRICT_REFERENCES(bCombien, WNDS, RNDS, WNPS);

  -- bFormcont ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BFORMCONT del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BFORMCONT
  */ 
  FUNCTION bFormcont RETURN EN_ENTIDAD.BFORMCONT%TYPE;
  PRAGMA RESTRICT_REFERENCES(bFormcont, WNDS, RNDS, WNPS);

  -- nTitular ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NTITULAR del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NTITULAR
  */ 
  FUNCTION nTitular RETURN EN_ENTIDAD.NTITULAR%TYPE;
  PRAGMA RESTRICT_REFERENCES(nTitular, WNDS, RNDS, WNPS);

  -- dFectitular ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo DFECTITULAR del registro interno del paquete  
  *
  * @return Devuelve el valor del campo DFECTITULAR
  */ 
  FUNCTION dFectitular RETURN EN_ENTIDAD.DFECTITULAR%TYPE;
  PRAGMA RESTRICT_REFERENCES(dFectitular, WNDS, RNDS, WNPS);

  -- bFirma ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BFIRMA del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BFIRMA
  */ 
  FUNCTION bFirma RETURN EN_ENTIDAD.BFIRMA%TYPE;
  PRAGMA RESTRICT_REFERENCES(bFirma, WNDS, RNDS, WNPS);

  -- bAval ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BAVAL del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BAVAL
  */ 
  FUNCTION bAval RETURN EN_ENTIDAD.BAVAL%TYPE;
  PRAGMA RESTRICT_REFERENCES(bAval, WNDS, RNDS, WNPS);

  -- vTrayectoria ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo VTRAYECTORIA del registro interno del paquete  
  *
  * @return Devuelve el valor del campo VTRAYECTORIA
  */ 
  FUNCTION vTrayectoria RETURN EN_ENTIDAD.VTRAYECTORIA%TYPE;
  PRAGMA RESTRICT_REFERENCES(vTrayectoria, WNDS, RNDS, WNPS);

  -- vCalidad ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo VCALIDAD del registro interno del paquete  
  *
  * @return Devuelve el valor del campo VCALIDAD
  */ 
  FUNCTION vCalidad RETURN EN_ENTIDAD.VCALIDAD%TYPE;
  PRAGMA RESTRICT_REFERENCES(vCalidad, WNDS, RNDS, WNPS);

  -- dFecaduca ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo DFECADUCA del registro interno del paquete  
  *
  * @return Devuelve el valor del campo DFECADUCA
  */ 
  FUNCTION dFecaduca RETURN EN_ENTIDAD.DFECADUCA%TYPE;
  PRAGMA RESTRICT_REFERENCES(dFecaduca, WNDS, RNDS, WNPS);

  -- nDominfo ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NDOMINFO del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NDOMINFO
  */ 
  FUNCTION nDominfo RETURN EN_ENTIDAD.NDOMINFO%TYPE;
  PRAGMA RESTRICT_REFERENCES(nDominfo, WNDS, RNDS, WNPS);

  -- nDomiso ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NDOMISO del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NDOMISO
  */ 
  FUNCTION nDomiso RETURN EN_ENTIDAD.NDOMISO%TYPE;
  PRAGMA RESTRICT_REFERENCES(nDomiso, WNDS, RNDS, WNPS);

  -- nDomino ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NDOMINO del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NDOMINO
  */ 
  FUNCTION nDomino RETURN EN_ENTIDAD.NDOMINO%TYPE;
  PRAGMA RESTRICT_REFERENCES(nDomino, WNDS, RNDS, WNPS);

  -- nTitujuri ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NTITUJURI del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NTITUJURI
  */ 
  FUNCTION nTitujuri RETURN EN_ENTIDAD.NTITUJURI%TYPE;
  PRAGMA RESTRICT_REFERENCES(nTitujuri, WNDS, RNDS, WNPS);

 

  -- bCifnifenti ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BCIFNIFENTI del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BCIFNIFENTI
  */ 
  FUNCTION bCifnifenti RETURN EN_ENTIDAD.BCIFNIFENTI%TYPE;
  PRAGMA RESTRICT_REFERENCES(bCifnifenti, WNDS, RNDS, WNPS);

  -- bPerjuri ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BPERJURI del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BPERJURI
  */ 
  FUNCTION bPerjuri RETURN EN_ENTIDAD.BPERJURI%TYPE;
  PRAGMA RESTRICT_REFERENCES(bPerjuri, WNDS, RNDS, WNPS);

  -- bReprelegal ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BREPRELEGAL del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BREPRELEGAL
  */ 
  FUNCTION bReprelegal RETURN EN_ENTIDAD.BREPRELEGAL%TYPE;
  PRAGMA RESTRICT_REFERENCES(bReprelegal, WNDS, RNDS, WNPS);

  -- bDni ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BDNI del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BDNI
  */ 
  FUNCTION bDni RETURN EN_ENTIDAD.BDNI%TYPE;
  PRAGMA RESTRICT_REFERENCES(bDni, WNDS, RNDS, WNPS);

  -- bCombienes ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BCOMBIENES del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BCOMBIENES
  */ 
  FUNCTION bCombienes RETURN EN_ENTIDAD.BCOMBIENES%TYPE;
  PRAGMA RESTRICT_REFERENCES(bCombienes, WNDS, RNDS, WNPS);

  -- bFirmas ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo BFIRMAS del registro interno del paquete  
  *
  * @return Devuelve el valor del campo BFIRMAS
  */ 
  FUNCTION bFirmas RETURN EN_ENTIDAD.BFIRMAS%TYPE;
  PRAGMA RESTRICT_REFERENCES(bFirmas, WNDS, RNDS, WNPS);

  -- nCodccc ------------------------------------------------------------
  /** 
  * Funci�n que recupera el valor del campo NCODCCC del registro interno del paquete  
  *
  * @return Devuelve el valor del campo NCODCCC
  */ 
  FUNCTION nCodccc RETURN EN_ENTIDAD.NCODCCC%TYPE;
  PRAGMA RESTRICT_REFERENCES(nCodccc, WNDS, RNDS, WNPS);



  ------------------------------------------------------------------------------
  --               Funciones tiene hijos                                     --
  ------------------------------------------------------------------------------

  -- tieneBa_entidad ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla Ba_entidad que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneBa_entidad(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneBa_entidad, RNPS, WNPS, WNDS);


  -- tieneEn_enticen ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla En_enticen que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneEn_enticen(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneEn_enticen, RNPS, WNPS, WNDS);


  -- tieneEn_entidadccc ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla En_entidadccc que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneEn_entidadccc(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneEn_entidadccc, RNPS, WNPS, WNDS);


  -- tieneEn_entidodoc ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla En_entidodoc que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneEn_entidodoc(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneEn_entidodoc, RNPS, WNPS, WNDS);


  -- tieneEn_entiempresa ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla En_entiempresa que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneEn_entiempresa(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneEn_entiempresa, RNPS, WNPS, WNDS);


  -- tieneEn_entipersona ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla En_entipersona que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneEn_entipersona(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneEn_entipersona, RNPS, WNPS, WNDS);


  -- tieneMo_modelocurso ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla Mo_modelocurso que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneMo_modelocurso(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneMo_modelocurso, RNPS, WNPS, WNDS);


  -- tienePc_expent ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla Pc_expent que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tienePc_expent(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tienePc_expent, RNPS, WNPS, WNDS);


  -- tieneSu_subvenmodelo ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla Su_subvenmodelo que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneSu_subvenmodelo(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneSu_subvenmodelo, RNPS, WNPS, WNDS);


  -- tieneVi_expe ------------------------------------------------------------
  /** 
  * Selecciona los registros de la tabla Vi_expe que aluden 
  * al registro de la tabla EN_ENTIDAD identificado por los 
  * par�metros de la funci�n Tiene. Devuelve TRUE si existen registros
  * y FALSE si no existen.
  *
  * @param  ncodenti_  Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si existe o no alguna ocurrencia en la tabla .
  */ 
  FUNCTION tieneVi_expe(
            ncodenti_  EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneVi_expe, RNPS, WNPS, WNDS);


  -- tieneHijos ------------------------------------------------------------
  /** 
  * Comprueba si tiene registros hijos asociados, para ello realizamos la  
  * llamada a cada una de las funciones tiene<tablaHija>. Cada vez que  
  * se cree una nueva tabla hija ser� necesario modificar el cuerpo de la  
  * funci�n y a�adir la nueva sentencia ELSIF con dicha llamada. Si no  
  * existen tablas hijas asociadas a la clave de la tabla solo devolver� FALSE  
  * 
  * @param  nCodenti_ Campo autonum�rico que sirve como clave primaria de la entidad
  * @param  vTexto_ Par�metro de salida que indica donde se encuentran 
  *         los registros hijos.
  * @return Devuelve si tiene hijos
  */ 
  FUNCTION tieneHijos ( 
            nCodenti_ EN_ENTIDAD.NCODENTI%TYPE,
            vTexto OUT VARCHAR2 ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneHijos, WNPS, WNDS);


  -- tieneHijos ------------------------------------------------------------
  /** 
  * Sobrecarga de la funci�n que no devuelve el texto  
  * @param  nCodenti_ Campo autonum�rico que sirve como clave primaria de la entidad
  * @return Devuelve si tiene hijos
  */ 
  FUNCTION tieneHijos ( 
            nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN BOOLEAN ;
  PRAGMA RESTRICT_REFERENCES(tieneHijos, WNPS, WNDS);


  -- vDondeTieneHijos ------------------------------------------------------------
  /** 
  * Funci�n que llama a tieneHijos y devuelve d�nde tiene los hijos.  
  * @param  nCodenti_ Campo autonum�rico que sirve como clave primaria de la entidad
  * @return  Texto que indica d�nde tiene hijos 
  */ 
  FUNCTION vDondeTieneHijos ( 
            nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN VARCHAR2 ;
  PRAGMA RESTRICT_REFERENCES(vDondeTieneHijos, WNPS, WNDS);


  --  insertar ------------------------------------------------------------
  /** 
  * Inserta el registro que se le pasa como par�metro  
  *
  * @param  rEN_ENTIDAD_ Registro que se va a insertar en la tabla
  */ 
  PROCEDURE insertar( rEN_ENTIDAD_ EN_ENTIDAD%ROWTYPE );
  PRAGMA RESTRICT_REFERENCES(insertar, RNPS, WNPS, RNDS);

  
  --  vDameCodigoEntidad (aag99h, 27/06/06)-----------------------------
  /** 
  * Funci�n que devuelve el codigo de la entidad, c�digo que reconocen los 
  * usuarios.
  *
  * @param  nCodenti_ identificador de la entidad.
  * @return devuelve el codigo de la entidad, c�digo que reconocen los 
  *         usuarios.
  */ 
  FUNCTION vDameCodigoEntidad( nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN VARCHAR2;
  PRAGMA RESTRICT_REFERENCES(vDameCodigoEntidad, WNDS, RNPS);

  --  vDameTipoEntidad (aag99h, 27/06/06)-----------------------------
  /** 
  * Funci�n que devuelve el tipo de la entidad.
  *
  * @param  nCodenti_ identificador de la entidad.
  * @return devuelve el tipo de la entidad.
  */ 
  FUNCTION vDameTipoEntidad( nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN VARCHAR2;
  PRAGMA RESTRICT_REFERENCES(vDameTipoEntidad, WNDS, RNPS);

  --  vDameRazonSocial (aag99h, 27/06/06)-----------------------------
  /** 
  * Funci�n que devuelve la raz�n social de la entidad.
  *
  * @param  nCodenti_ identificador de la entidad.
  * @return devuelve la raz�n social de la entidad.
  */ 
  FUNCTION vDameRazonSocial( nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN VARCHAR2;
  PRAGMA RESTRICT_REFERENCES(vDameRazonSocial, WNDS, RNPS, WNPS);
  

  --  vFormateaEntidadParaAviso (smc71j, 18/07/06)-----------------------------
  /** 
  * Funci�n que devuelve los datos de la entidad preparados para incorporarlos a * un aviso. Codigo de entidad - Nombre de entidad.
  *
  * @param  nCodenti_ identificador de la entidad.
  * @return devuelve los datos de la entidad listos para incorporarlos a un     * aviso.
  */ 
   FUNCTION vFormateaEntidadParaAviso( nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) 
   RETURN VARCHAR2;
   PRAGMA RESTRICT_REFERENCES(vFormateaEntidadParaAviso, WNDS, WNPS);


  --  nCursosSinPlanificar (aag99h, 20/07/06)-----------------------------
  /** 
  * Funci�n que devuelve el n�mero de cursos sin planificar de la entidad.
  *
  * @param  nCodenti_ identificador de la entidad.
  * @return devuelve el n�mero de cursos sin planificar de la entidad.
  */ 
  FUNCTION nCursosSinPlanificar( nCodenti_ EN_ENTIDAD.NCODENTI%TYPE ) 
  RETURN NUMBER;
  PRAGMA RESTRICT_REFERENCES(nCursosSinPlanificar, WNDS, RNPS);

  ------------------------------------------------------------------
  --     Funciones para conseguir clave primaria                  --
  ------------------------------------------------------------------
  -- nNuevoCodEntidad (smc71j, 09/10/2006)-----------------------------
  /**
  * Funci�n que obtiene un nuevo c�digo de entidad
  *
  * @return Nuevo c�digo de entidad
  */
  FUNCTION nNuevoCodEntidad RETURN EN_ENTIDAD.NCODENTI%TYPE;
  PRAGMA RESTRICT_REFERENCES( nNuevoCodEntidad, RNPS, WNPS, WNDS );

  -- nDameIdEntidad (smc71j, 09/10/2006)-----------------------------
  /**
  * Funci�n que obtiene el identificador de entidad usando el c�digo de 
  * entidad proveniente de la tabla de SEFPAEC.
  *
  * @param vEntidad_ C�digo de entidad proveniente de SEFPAEC
  * @return Identificador de entidad.
  */
  FUNCTION nDameIdEntidad ( vEntidad_ EN_ENTIDAD.VENTIDAD%TYPE )
  RETURN EN_ENTIDAD.NCODENTI%TYPE;
  PRAGMA RESTRICT_REFERENCES( nDameIdEntidad, RNPS, WNPS, WNDS );

END;
