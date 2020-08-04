<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="tn.essatin.model.TypeMatiere"%>
<%@page import="tn.essatin.model.Niveau"%>
<%@page import="tn.essatin.model.Semestre"%>


<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Matieres</title>

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
                    <h1 class="page-header">Ajouter une matiere</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
             <div class="row">
                <div class="col-lg-12">
                   <div class="panel panel-primary">
                   <div class="panel-heading">
                   Nouveau Matiere
                        </div>
                        
                        <div class="panel-body">
                        <form action="AjouterMatiere" method="post">
  <div class="form-group">
    <label >Nom</label>
    <input type="text" class="form-control" name="nom"  placeholder="Nom">
    
  </div>
  <div class="form-group">
    <label >Coefficient</label>
    <input type="text" class="form-control" name="coefficient" placeholder="coefficient">
  </div>
  <div class="form-group">
    <label>Volume Horaire</label>
    <input type="text" class="form-control" name="volumeHoraire" placeholder="Volume Horaire">
  </div>
  <div class="form-group">
    <label >Type Matiere</label>
    <select  class="form-control" name="typeMatiere"  >
    <c:forEach var="t" items="${t}" >
    <option value="${t.id}"> ${t.nom}</option> 

</c:forEach>
    </select>
    <div class="text-right">
                   <a href="AjouterTypeMatiere"><i class="fa fa-plus"></i>Ajouter</a>
                   </div>
  </div> 
  <div class="form-group">
    <label >Niveau</label>
    <select  class="form-control" name="niveau"  >
    <c:forEach var="n" items="${n}" >
    <option value="${n.id}">  ${n.designation} ${n.parcours}</option> 

</c:forEach>
    </select>
  </div> 
  <div class="form-group">
    <label >Semestre</label>
    <select  class="form-control" name="semestre"  >
    <c:forEach var="s" items="${s}" >
    <option value="${s.id}"> ${s.nom}</option> 

</c:forEach>
    </select>
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
