class ExamSuspendException extends RuntimeException{
    ExamSuspendException(String s){
        super(s);
        
    }
    public void PrintStackTrace(){
      System.out.print(getMessage());
        System.out.println("Exam Suspended");
    }
}