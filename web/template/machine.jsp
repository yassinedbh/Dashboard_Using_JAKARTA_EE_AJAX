 <div class="content-wrapper">
          <div class="row">
            
            
            <div class="col-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Gestion Machine</h4>
                  <p class="card-description">
                    Gerer vos Machines en une seule clique
                  </p>
                  <br>
                  
                 
                    <div class="form-group">
                       
                      <label for="reference">Référence</label>
                      <input type="text" class="form-control" id="reference" placeholder="Référence" name="reference" required>
                    </div>
                    
                      <div class="form-group">
                        <label for="dateAchat" >Date Achat</label>
                        <input type="date" class="form-control" id="dateAchat" name="dateAchat" required>
                    </div>
                      
                       
                    <div class="form-group">
                      <label for="marque">Marque</label>
                      <select class="form-control" id="marquecmb" required>
                         
                        </select>
                      </div>   
                       
                       
                    <div class="form-group">
                        <label for="prix" >Prix</label>
                      <div class="input-group">
                        <div class="input-group-prepend">
                          <span class="input-group-text bg-primary text-white">$</span>
                        </div>
                          <input type="number" class="form-control" aria-label="Amount (to the nearest dollar)" id="prix" placeholder="Prix" name="prix" required>
                        <div class="input-group-append">
                          <span class="input-group-text">.00</span>
                        </div>
                      </div>
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
                  <h4 class="card-title">Liste Des Machines</h4>
                  <p class="card-description">
                    Accéder a vos Machines en une seule clique
                  </p>
                  <div class="table-responsive pt-3">
                    <table class="table table-bordered">
                      <thead>
                        <tr style="text-align: center">
                          <th>
                            Id
                          </th>
                          <th>
                           Reference
                          </th>
                          <th>
                           DateAchat
                          </th>
                          <th>
                            Prix
                          </th>
                           <th>
                            IDmarque
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