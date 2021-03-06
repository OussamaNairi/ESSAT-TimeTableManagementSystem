<%@page import="tn.essatin.dao.IPfeDao"%>
<%@page import="tn.essatin.dao.PfeDaoImp"%>
<%@page import="tn.essatin.model.Pfe"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>PFE</title>

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
                    <h1 class="page-header">PFE</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
             <div class="row">
                <div class="col-lg-12">
                   <ol class="breadcrumb">
                   <li><a href="AjouterPfeInter"><i class="fa fa-plus"></i>Ajouter</a></li>
                   </ol>
                        </div>
                        </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            Liste des PFE
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover"  id="dataTables-example"  >
                                    <thead>
                                        <tr>
                                           <th>Titre</th>
                                            <th>Description</th>
                                            <th>Mots Cle</th>
                                            <th>Technologie</th>
                                            <th>Date Debut</th>
                                             <th>Date Fin</th>
                                             <th>Projet Externe</th>
                                             <th>Nom Societe</th>
                                             <th>Enseignant</th>
                                             <th>Departement</th>
                                           <th>Actions</th>
                   

                        
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="p" items="${liste}" >

<tr>
<td>  ${p.titre}</td>
<td> ${p.description}</td>
<td>  ${p.motCle}</td>
<td>  ${p.technologie}</td>
<td>   ${p.dateDebut}</td>
<td>   ${p.dateFin}</td>
<td>   ${p.projetExterne}</td>
<td>   ${p.nomSociete}</td>
<td>   ${p.idenseignant}</td>
<td>   ${p.idepartement}</td>


<td><a href="ModifierPfe?id=${p.id}"><span class="fa fa-edit"></span></a>&nbsp;|&nbsp; <a href="DeletePfe?id=${p.id}"><span class="fa fa-trash-o"></span></a></td>

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
