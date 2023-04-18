public class App {


static boolean iWillReview = false;
static boolean iwillNotFail = true;
    public static void main(String[] args) throws Exception {
        
        App myApp = new App();

        //precondtion 
        
        assert iWillReview == true: "HINDI AKO MAGREREVIEW";
       
       
        myApp.Study();
        
        assert iwillNotFail == true: "I WONT BABAGSAK";
       
}



void Study () {
   iwillNotFail = false;

}
} 