<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="tn.essatin.model.Enseignant"%>
<%@page import="tn.essatin.model.ChargeHoraire"%>


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
                    <h1 class="page-header">Affecter</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
             <div class="row">
                <div class="col-lg-12">
                   <div class="panel panel-primary">
                   <div class="panel-heading">
                  Modifier Affectation
                        </div>
                        
                        <div class="panel-body">
                        <form action="UpdateAffectation" method="post">

  
  <div class="form-group">
    <label >Enseignant</label>
    <select  class="form-control" name="enseignant"  >
     <c:forEach var="en" items="${en}">
     <c:if test="${en.id==af.enseignant.id}">
    <option value="${en.id}" selected> ${en.prenom} ${en.nom}</option> 
    </c:if>
    <c:if test="${en.id!=af.enseignant.id}">
    <option value="${en.id}" > ${en.prenom} ${en.nom}</option> 
    </c:if>

</c:forEach>
                   
    </select>
                   
  </div>
  <div class="form-group">
    <label >Matiere</label>
    <select  class="form-control" name="chargeHoraire"  >
     <c:forEach var="ch" items="${ch}">
     <c:if test="${ch.id==af.chargeHoraire.id}">
    <option value="${ch.id}" selected>  ${ch.matiere} ${ch.nom}</option> 
    </c:if>
    <c:if test="${ch.id!=af.chargeHoraire.id}">
    <option value="${ch.id}" > ${ch.matiere} ${ch.nom}</option> 
    </c:if>

</c:forEach>
                   
    </select>
                   
  </div>
  <input type="hidden" class="form-control" name="id"   value="${af.id}">
                        

 

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