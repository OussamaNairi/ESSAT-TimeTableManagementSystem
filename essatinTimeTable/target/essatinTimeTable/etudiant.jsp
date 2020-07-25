<%@page import="tn.essatin.dao.IEtudiantDao"%>
<%@page import="tn.essatin.dao.EtudiantDaoImp"%>
<%@page import="tn.essatin.model.Etudiant"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                    <h1 class="page-header">Etudiants</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
             <div class="row">
                <div class="col-lg-12">
                   <ol class="breadcrumb">
                   <li><a href="AjouterEtudiantInter"><i class="fa fa-plus"></i>Ajouter</a></li>
                   </ol>
                        </div>
                        </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-danger">
                        <div class="panel-heading">
                            Liste des etudiants
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover"  id="dataTables-example"  >
                                    <thead>
                                        <tr>
                                             <th>ID</th>
                                             <th>Nom</th>
                                            <th>Prenom</th>
                                            <th>Email</th>
                                              <th>Tel</th>
                                              <th>Actions</th>
                   

                        
                                            
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="et" items="${liste}" >

<tr>
<td> ${et.id}</td>
<td> ${et.nom}</td>
<td>  ${et.prenom}</td>
<td>  ${et.mail}</td>
<td>   ${et.tel}</td>




<td><a href="ModifierEtudiant?id=${et.id}"><span class="fa fa-edit"></span></a>&nbsp;|&nbsp; <a href="DeleteEtudiant?id=${et.id}"><span class="fa fa-trash-o"></span></a></td>

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
