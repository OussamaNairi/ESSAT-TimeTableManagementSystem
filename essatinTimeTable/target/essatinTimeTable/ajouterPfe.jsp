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
                    <h1 class="page-header">Ajouter PFE</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
             <div class="row">
                <div class="col-lg-12">
                   <div class="panel panel-primary">
                   <div class="panel-heading">
                   Nouveau PFE
                        </div>
                        
                        <div class="panel-body">
                        <form action="AjouterPfe" method="post">
  <div class="form-group">
    <label >Titre</label>
    <input type="text" class="form-control" name="titre"  placeholder="Titre">
    
  </div>
  <div class="form-group">
    <label >Description</label>
    <input type="text" class="form-control" name="description" placeholder="Description">
  </div>
  <div class="form-group">
    <label>Mot Cle</label>
    <input type="text" class="form-control" name="motCle" placeholder="Mot Cle">
  </div>
  <div class="form-group">
    <label>Technologie</label>
    <input type="text" class="form-control" name="technologie" placeholder="Technologie">
  </div>
  <div class="form-group">
    <label>Date Debut</label>
    <input type="text" class="form-control" name="dateDebut" placeholder="Date Debut">
  </div>
  <div class="form-group">
    <label>Date Fin</label>
    <input type="text" class="form-control" name="dateFin" placeholder="Date Fin">
  </div>
  <div class="form-group">
    <label>Projet Externe</label>
    <input type="text" class="form-control" name="projetExterne" placeholder="Projet Externe">
  </div>
  <div class="form-group">
    <label>Nom Societe</label>
    <input type="text" class="form-control" name="sexe" placeholder="Nom Societe">
  </div>
  <div class="form-group">
    <label >Enseignant</label>
    <select  class="form-control" name="enseignant"  >
    <c:forEach var="en" items="${en}" >
    <option value="${en.id}"> ${en.prenom} ${en.nom}</option> 

</c:forEach>
    </select>
    <div class="text-right">
                   <a href="AjouterEnseignantInter"><i class="fa fa-plus"></i>Ajouter</a>
                   </div>
  </div>  
    <div class="form-group">
    <label >Departement</label>
    <select  class="form-control" name="departement"  >
    <c:forEach var="d" items="${d}" >
    <option value="${d.id}"> ${d.nom}</option> 

</c:forEach>
    </select>
    <div class="text-right">
                   <a href="AjouterDepartement"><i class="fa fa-plus"></i>Ajouter</a>
                   </div>
  </div>  


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
