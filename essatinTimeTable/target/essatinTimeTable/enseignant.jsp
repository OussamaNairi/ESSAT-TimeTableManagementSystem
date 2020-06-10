<%@page import="tn.essatin.dao.IEnseignantDao"%>
<%@page import="tn.essatin.dao.EnseignantDaoImp"%>
<%@page import="tn.essatin.model.Enseignant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Enseignants</title>

    <!-- Core CSS - Include with every page -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.css" rel="stylesheet">

    <!-- Page-Level Plugin CSS - Tables -->
    <link href="css/plugins/dataTables/dataTables.bootstrap.css" rel="stylesheet">

    <!-- SB Admin CSS - Include with every page -->
    <link href="css/sb-admin.css" rel="stylesheet">
 <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"> 

</head>

<body>
<%@include file="header.jsp" %>

        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Enseignants</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
             <div class="row">
                <div class="col-lg-12">
                   <ol class="breadcrumb">
                   <li><a href="AjouterEnseignantInter"><i class="fa fa-plus"></i>Ajouter</a></li>
                   </ol>
                        </div>
                        </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            Liste des enseignants
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover"  id="dataTables-example" style="width:100%" >
                                    <thead>
                                        <tr>
                                           <th>Image</th>
                                            <th>Nom</th>
                                            <th>Prenom</th>
                                            <th>Email</th>
                                            <th>Adresse</th>
                                             <th>Tel</th>
                                            <th>Date de Naissance</th>
                                            <th>Lieu de Naissance</th>
                                            <th>Type Identificateur</th>
                                            <th>Identificateur</th>
                                            <th>Sexe</th>
                                            <th>Nationalite</th>
                                            <th>CNSS</th>
                                            <th>CNRPS</th>
                                            <th>Date Entree</th>
                                            <th>Observation</th>
                                            <th >Situation</th>
                                            <th>Nombre Enfants</th>
                                            <th >Diplome</th>
                                             <th>RIB IBAN</th>
                                               <th >Poste</th>
                                             <th>Etablissement d'origine</th>
                                              <th>Actions</th>
                   

                        
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="en" items="${liste}" >

<tr>
<td>  ${en.image}</td>
<td> ${en.nom}</td>
<td>   ${en.prenom}</td>
<td>  ${en.mail}</td>
<td>   ${en.adresse}</td>
<td>   ${en.tel}</td>
<td>   ${en.dateDeNaissance}</td>
<td>  ${en.lieuDeNaissance}</td>
<td>  ${en.identificateur}</td>
<td>  ${en.numeroIdentificateur}</td>
<td>   ${en.sexe}</td>
<td>   ${en.nationalite}</td>
<td>  ${en.cnss}</td>
<td>  ${en.cnrps}</td>
<td>  ${en.dateEntree}</td>
<td>   ${en.observation}</td>
<td>   ${en.situationM}</td>
<td>  ${en.nombreEnfants}</td>
<td>  ${en.diplome}</td>
<td>  ${en.ribIban}</td>
<td>  ${en.poste}</td>
<td>  ${en.etablissementOrigine}</td>


<td><a href="ModifierEnseignant?id=${en.id}"><span class="fa fa-edit"></span></a>&nbsp;|&nbsp; <a href="DeleteEnseignant?id=${en.id}"><span class="fa fa-trash-o"></span></a></td>

</tr>
</c:forEach>
                                    </tbody>
                                </table>
                            </div>
                           
                        </div>
                       
                    </div>
                   
                </div>
              
            </div>

                            
        </div>


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
