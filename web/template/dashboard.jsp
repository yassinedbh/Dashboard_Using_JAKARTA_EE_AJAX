<%-- 
    Document   : dashboard.jsp
    Created on : 2 janv. 2022, 19:10:59
    Author     : yassi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="content-wrapper">
    <div class="row">
        <div class="col-md-12 grid-margin">
            <div class="row">
                <div class="col-12 col-xl-8 mb-4 mb-xl-0">

                    <c:if test="${ !empty sessionScope.username  }">
                        <h3 class="font-weight-bold">Welcome ${sessionScope.username}</h3>
                    </c:if>

                    <h6 class="font-weight-normal mb-0">Tous les systèmes fonctionnent correctement !</h6>
                </div>
                <div class="col-12 col-xl-4">
                    <div class="justify-content-end d-flex">
                        <div class="dropdown flex-md-grow-1 flex-xl-grow-0">
                            <button class="btn btn-sm btn-light bg-white dropdown-toggle" type="button" id="dropdownMenuDate2" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                                <i class="mdi mdi-calendar"></i> Today (10 Jan 2021)
                            </button>
                            <div class="dropdown-menu dropdown-menu-right" aria-labelledby="dropdownMenuDate2">
                                <a class="dropdown-item" href="#">January - March</a>
                                <a class="dropdown-item" href="#">March - June</a>
                                <a class="dropdown-item" href="#">June - August</a>
                                <a class="dropdown-item" href="#">August - November</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 grid-margin stretch-card">
            <div class="card tale-bg">
                <div class="card-people mt-auto">
                    <img src="template/images/dashboard/people.svg" alt="people">
                    <div class="weather-info">
                        <div class="d-flex">
                            <div>
                                <h2 class="mb-0 font-weight-normal"><i class="icon-sun mr-2"></i>31<sup>C</sup></h2>
                            </div>
                            <div class="ml-2">
                                <h4 class="location font-weight-normal">Marrakech</h4>
                                <h6 class="font-weight-normal">Morocco</h6>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-6 grid-margin transparent">
            <div class="row">
                <div class="col-md-6 mb-4 stretch-card transparent">
                    <div class="card card-tale">
                        <div class="card-body">
                            <p class="mb-4">Totale Des Achats</p>
                            <p class="fs-30 mb-2" id="achatc"></p>
                            <p>10.00% (30 days)</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 mb-4 stretch-card transparent" >
                    <div class="card card-dark-blue">
                        <div class="card-body">
                            <p class="mb-4">Totale Des Marques</p>
                            <p class="fs-30 mb-2" id="marquec"></p>
                            <p>22.00% (30 days)</p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6 mb-4 mb-lg-0 stretch-card transparent">
                    <div class="card card-light-blue">
                        <div class="card-body">
                            <p class="mb-4">Totale Des Utilisateurs</p>
                            <p class="fs-30 mb-2" id="userc"></p>
                            <p>20.00% (30 days)</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6 stretch-card transparent">
                    <div class="card card-light-danger">
                        <div class="card-body">
                            <p class="mb-4">Totale Des Machines</p>
                            <p class="fs-30 mb-2" id="machinec">47033</p>
                            <p>0.22% (30 days)</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-6 grid-margin stretch-card">
            <div class="card">
                <div class="card-body">
                    <p class="card-title">Nombre Des Machines Par Marque</p>
                    <p class="font-weight-500">Ce graphe represente le nombre de machine associé pour chaque marque existante dans notre magasin .</p>
                    </br>
                     </br>
                    <canvas id="mycanvas2"></canvas>
                </div>
            </div>
        </div>
        <div class="col-md-6 grid-margin stretch-card">
            <div class="card">
                <div class="card-body">
                    <p class="card-title">Achats Par Marque</p>
                    <p class="font-weight-500">Ce graphe represente la somme des prix pour les machines par rapport a chaque marque existante dans notre magasin .</p>
                    </br>
                     </br>
                    <canvas id="mycanvas"></canvas>
                </div>
            </div>
        </div>
    </div>



</div>