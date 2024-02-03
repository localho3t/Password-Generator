public class CheckAgrs {
    private String[] args;


    private Boolean check(){
        if (this.args.length == 2 ){
            return true;
        }else{
            return false;
        }
    }

    public Boolean CheckAgrs(String[] args){
        this.args = args;
        if (this.check()){
            return true;
        }else{
            return false;
        }
    }


}
