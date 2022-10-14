class University{
    boolean stange_things=true;
    void exam(){
        if(stange_things){
           
             throw new ExamSuspendException("Strange things happens");
            // try {
            //      throw new ExamSuspendException("Strange things happens");
                
            // } catch(ExamSuspendException e) {
            //     e.PrintStackTrace();
            // }
        }
    }
}
