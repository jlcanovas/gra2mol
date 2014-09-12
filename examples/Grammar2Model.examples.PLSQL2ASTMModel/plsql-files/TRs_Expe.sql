/** 
  * Descripci�n.: <br /> 
  * Autor.......: Sinergia Tecnol�gica (rse04m), 28/11/2006 <br /> 
  * Fichero.....: $Source: /data/cvs/adaptech/operativa/construccion/gefe/src/ddl/pack/trs_expe.s.sql,v $ <br /> 
  * Id..........: $Id: trs_expe.s.sql,v 1.4 2006/12/21 09:25:36 rse04m Exp $ <br /> 
  * Version.....: $Revision: 1.4 $ <br /> 
  * Alta CVS....: $Author: rse04m $ <br /> 
  * Fecha.......: $Date: 2006/12/21 09:25:36 $ <br /> 
  */


  CREATE OR REPLACE PACKAGE TRS_EXPE IS


  /** 
  * Version CVS de la especificaci�n.  
  *
  */ 
  SPEC_RCS_VERSION CONSTANT VARCHAR2(30) := '$Revision: 1.4 $'; 
  
  ------------------------------------------------------------------------------
  --               Funciones control de versiones                             --
  ------------------------------------------------------------------------------
  -- getSpecRCSRev ------------------------------------------------------------
  /** 
  * Proporciona la versi�n de RCS del SPEC de paquete. 
  * 
  * @return Versi�n de la especificaci�n. 
  */ 
  FUNCTION getSpecRCSRev RETURN VARCHAR2;
  PRAGMA RESTRICT_REFERENCES(getSpecRCSRev, RNDS, WNDS, WNPS);

  --  getBodyRCSRev ------------------------------------------------------------
  /** 
  * Proporciona la versi�n de RCS del BODY de paquete. 
  * 
  * @return Versi�n del body. 
  */ 
  FUNCTION getBodyRCSRev RETURN VARCHAR2;
  PRAGMA RESTRICT_REFERENCES(getBodyRCSRev, RNDS, WNDS, WNPS);
  ------------------------------------------------------------------------------
  -- Funciones que devuelven constantes de c�digos de tr�mites                --
  ------------------------------------------------------------------------------
  --vDameCodRutaUSol (rse04m, 28/11/2006)---------------------------------------
  /** 
  * Funci�n que devuelve el c�digo de ruta solicitada
  */ 
  FUNCTION vDameCodRutaUSol  RETURN VARCHAR2 DETERMINISTIC;
  PRAGMA RESTRICT_REFERENCES( vDameCodRutaUSol, RNDS, WNDS, RNPS, WNPS );

   ------------------------------------------------------------------------------
  -- Funciones para tramitar expediente de renuncia                           --
  ------------------------------------------------------------------------------


  --  intentaSolicitarRSU  (rse04m, 28/11/2006)---------------------------------
  /** 
  * Funci�n con la que un usuario determinado intenta ejecutar la acci�n de 
  * ENVIA sobre un documento de solicitud de renuncia de subvenci�n para ello
  * hace uso de la funci�n intentaEjecutarAccion de CO.PDo_Docuaccion
  *
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @param vCodUsua_   l�gin de usuario que realiza el tr�te
  *
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION intentaSolicitarRSU( nIdExpe_    CO.EP_EXPETRA.NIDEXPE%TYPE,
                                dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;
   --  intentaDeshacerSolicitarRSU  (rse04m, 28/11/2006)------------------------
  /** 
  * Funci�n con la que un usuario determinado intenta deshacer la acci�n de 
  * ENVIA sobre un documento de solicitud de renuncia de subvenci�n y deshacer 
  * el tramite de solicitar
  *
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @param vCodUsua_   l�gin de usuario que realiza el tr�te
  *
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION intentaDeshacerSolicitarRSU( nIdExpe_    CO.EP_EXPETRA.NIDEXPE%TYPE,
                                dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;



  --  puedeSolicitarRSU  (rse04m, 28/11/2006) ----------------
  /** 
  * Funci�n con la que un usuario determinado intenta ejecutar la acci�n de 
  * ENVIA sobre un documento de solicitud de renuncia de subvenci�n para ello
  * hace uso de la funci�n intentaEjecutarAccion de CO.PDo_Docuaccion
  *
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @param vCodUsua_   l�gin de usuario que realiza el tr�te
  *
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION puedeSolicitarRSU( nIdExpe_    CO.EP_EXPETRA.NIDEXPE%TYPE,
                              dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;

   ----intentaProponerAnulacionRSU(rse04m,10/10/2006)---------------------------
  /** 
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION intentaProponerAnulacionRSU( nIdExpe_    CO.EP_EXPETRA.NIDEXPE%TYPE,
                                dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;

  --  puedeSolicitarRSU  (rse04m, 28/11/2006) ----------------
  /** 
  * Funci�n con la que un usuario determinado intenta ejecutar la acci�n de 
  * ENVIA sobre un documento de solicitud de renuncia de subvenci�n para ello
  * hace uso de la funci�n intentaEjecutarAccion de CO.PDo_Docuaccion
  *
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @param vCodUsua_   l�gin de usuario que realiza el tr�te
  *
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION puedeTrasladarContabilidadRSU(
                                  nIdExpe_    CO.EP_EXPETRA.NIDEXPE%TYPE,
                                  dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;
  

  --  puedeDarBajaRSU  (rse04m, 28/11/2006) ----------------
  /** 
  * Punto de funci�n de control de ejecuci�n de dar baja.
  *
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  *
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION puedeDarBajaRSU(
                                  nIdExpe_    CO.EP_EXPETRA.NIDEXPE%TYPE,
                                  dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;

  ---intentaDarBajaRSU(rse04m,10/10/2006)---------------------------
  /** 
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION intentaDarBajaRSU( nIdExpe_    CO.EP_EXPETRA.NIDEXPE%TYPE,
                                dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;
  ---intentaRecibirContabilidadRSU(rse04m,10/10/2006)---------------------------
  /** 
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION intentaRecibirContabilidadRSU( nIdExpe_  CO.EP_EXPETRA.NIDEXPE%TYPE,
                                dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;
  --intentaDesRecContabilidadRSU(rse04m,10/10/2006)---------------------
  /** 
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION intentaDesRecContabilidadRSU( nIdExpe_  CO.EP_EXPETRA.NIDEXPE%TYPE,
                                dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;
  --intentaDesPropAnulacionRSU(rse04m,10/10/2006)---------------------
  /** 
  * @param nIdExpe_    c�digo de expediente de renuncia
  * @param dFecAccion_ fecha de acci�n del usuario
  * @return            <ul><li>TRUE si se pudo realizar la acci�n</li>
  *                         <li>FALSE en otro caso</li></ul>
  */   
  FUNCTION intentaDesPropAnulacionRSU( nIdExpe_  CO.EP_EXPETRA.NIDEXPE%TYPE,
                                dFecAccion_ CO.DO_DOCUACCION.DFECACCION%TYPE )
  RETURN BOOLEAN;
  
 
  END;
 