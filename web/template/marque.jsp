<div class="content-wrapper">
    <div class="row">


        <div class="col-12 grid-margin stretch-card">
            <div class="card">
                <div class="card-body">
                    <h4 class="card-title">Gestion Marque</h4>
                    <p class="card-description">
                        Gerer vos Marques en une seule clique
                    </p>
                    <br>


                    <div class="form-group">
                        <label for="code">Code</label>
                        <input type="text" class="form-control" id="code" placeholder="Saisir un code" name="code" required>
                    </div>

                    <div class="form-group">
                        <label for="libelle">Libelle</label>
                        <input type="text" class="form-control" id="libelle" placeholder="Saisir un libelle" name="libelle" required>
                    </div>
                    <br>
                    <button id="send" type="submit" class="btn btn-primary mr-2 send">Submit</button>
                    <button id="modifie" class="btn btn-light" style="display:none;">Modifier</button>
                    
                </div>
            </div>


        </div>





        <div class="col-lg-12 stretch-card">
            <div class="card">
                <div class="card-body">
                    <h4 class="card-title">Liste Des Marques</h4>
                    <p class="card-description">
                        Accéder a vos Marques en une seule clique
                    </p>
                    <div class="table-responsive pt-3">
                        <table class="table table-bordered">
                            <thead>
                                <tr style="text-align: center">
                                    <th>
                                        Id
                                    </th>
                                    <th>
                                        Code
                                    </th>
                                    <th>
                                        Libelle
                                    </th>
                                    <th>
                                        Supprimer
                                    </th>
                                    <th>
                                        Modifier
                                    </th>
                                </tr>
                            </thead>
                            <tbody id="content">

                            </tbody>


                        </table>
                    </div>
                </div>
            </div>
        </div>















    </div>
</div>