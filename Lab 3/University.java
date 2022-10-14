class University{
    boolean stange_things=true;
    void exam(){
        if(stange_things){
           
            
            try {
                 throw new ExamSuspendException("Strange things happens");
                
            } catch(ExamSuspendException e) {
                e.PrintStackTrace();
            }
        }
    }
}
