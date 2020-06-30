<%@page import="java.util.List"%>
<%@page import="tn.essatin.dao.IEtudiantDao"%>
<%@page import="tn.essatin.dao.EtudiantDaoImp"%>
<%@page import="tn.essatin.dao.INationaliteDao"%>
<%@page import="tn.essatin.dao.NationaliteDaoImp"%>
<%@page import="tn.essatin.dao.IIdentificateurDao"%>
<%@page import="tn.essatin.dao.IdentificateurDaoImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="tn.essatin.model.Etudiant"%>
        <%@page import="tn.essatin.model.Nationalite"%>
      <%@page import="tn.essatin.model.Identificateur"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Etudiants</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Tables -->
    <link href="css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">

</head>

<body>
<%@include file="header.jsp" %>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Modifier un Etudiant</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
             <div class="row">
                <div class="col-lg-12">
                   <div class="panel panel-primary">
                   <div class="panel-heading">
                   Modifier Etudiant
                        </div>
                        
                        <div class="panel-body">
                        <form action="UpdateEtudiant" method="get">
<div class="form-group">
    <label >Nom</label>
    <input type="text" class="form-control" name="nom"  value="${et.nom}" readonly="readonly">>
    
  </div>
  <div class="form-group">
    <label >Prenom</label>
    <input type="text" class="form-control" name="prenom" value="${et.prenom}" readonly="readonly">>
  </div>
  <div class="form-group">
    <label>Email</label>
    <input type="text" class="form-control" name="mail" value="${et.mail}" readonly="readonly">>
  </div>
  <div class="form-group">
    <label>Adresse</label>
    <input type="text" class="form-control" name="adresse" value="${et.adresse}" readonly="readonly">>
  </div>
  <div class="form-group">
    <label>Telephone</label>
    <input type="text" class="form-control" name="tel" value="${et.tel}" readonly="readonly">>
  </div>
  <div class="form-group">
    <label>Date de Naissance</label>
    <input type="text" class="form-control" name="dateDeNaissance" value="${et.dateDeNaissance}" readonly="readonly">>
  </div>
  <div class="form-group">
    <label>Lieu de Naissance</label>
    <input type="text" class="form-control" name="lieuDeNaissance" value="${et.lieuDeNaissance}" readonly="readonly">>
  </div>
  <div class="form-group">
   <label >Type Identificateur</label>
    <select  class="form-control" name="identificateur"   readonly="readonly">>
     <c:forEach var="ident" items="${ident}">
     <c:if test="${ident.id==et.identificateur.id}">
    <option value="${ident.id}" selected> ${ident.designation}</option> 
    </c:if>
    <c:if test="${ident.id!=et.identificateur.id}">
    <option value="${ident.id}" > ${ident.designation}</option> 
    </c:if>

</c:forEach>
    </select>
  </div>
  <div class="form-group">
    <label>Numero Identificateur</label>
    <input type="text" class="form-control" name="numeroIdentificateur" value="${et.numeroIdentificateur}" readonly="readonly">>
  </div>
  <div class="form-group">
    <label>Sexe</label>
    <input type="text" class="form-control" name="sexe" value="${et.sexe}" readonly="readonly">>
  </div>
  <div class="form-group">
    <label >Nationalite</label>
   <select  class="form-control" name="nationalite"  readonly="readonly">>
     <c:forEach var="nat" items="${nat}">
     <c:if test="${nat.id==et.nationalite.id}">
    <option value="${nat.id}" selected> ${nat.nom}</option> 
    </c:if>
    <c:if test="${nat.id!=et.nationalite.id}">
    <option value="${nat.id}" > ${nat.nom}</option> 
    </c:if>

</c:forEach>
    </select>
  </div>  <div class="form-group">
    <label>Description</label>
    <input type="text" class="form-control" name="cnss" value="${et.description}" readonly="readonly">>
  </div>
    <input type="hidden" class="form-control" name="id"   value="${en.id}">
                        <div class="panel-footer">
                        
                            <button type="submit" class="btn btn-primary"><i class="fa fa-save">&nbsp;</i>Enregistrer</button>
                            <button type="reset" class="btn btn-danger"><i class="fa fa-arrow-left">&nbsp;</i>Annuler</button>
                           
                        </div>
                       </form>
                        </div>
                        
                 </div>
                 </div>
                 </div>
                        
                    

                            
        </div>
        <!-- /#page-wrapper -->

    
    <!-- /#wrapper -->

    <!-- Core Scripts - Include with every page -->
    <script src="js/jquery-1.10.2.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>

    <!-- Page-Level Plugin Scripts - Tables -->
    <script src="js/plugins/dataTables/jquery.dataTables.js"></script>
    <script src="js/plugins/dataTables/dataTables.bootstrap.js"></script>

    <!-- SB Admin Scripts - Include with every page -->
    <script src="js/sb-admin.js"></script>

    <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>

</body>

</html>
