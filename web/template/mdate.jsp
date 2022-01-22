 <div class="content-wrapper">
          <div class="row">
            
            
            <div class="col-12 grid-margin stretch-card">
              <div class="card">
                <div class="card-body">
                  <h4 class="card-title">Recherche Machine Par Date</h4>
                  <p class="card-description">
                    Rechercher vos Machines en une seule clique
                  </p>
                  <br>
                  
                 
                      <div class="form-group">
                        <label for="dateAchatD" >Date Debut</label>
                        <input type="date" class="form-control" id="dateAchatD" name="dateAchatD" required>
                    </div>
                  
                  
                  <div class="form-group">
                        <label for="dateAchatF" >Date Fin</label>
                        <input type="date" class="form-control" id="dateAchatF" name="dateAchatF" required>
                    </div>
                 
                       
                    <br>
                    <button id="send" type="submit" class="btn btn-primary mr-2 send">Recherche</button>
                    
                   
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