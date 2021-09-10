package LSPP;


    class Son extends Father{
   /**
 31 The parameter String is a subclass of CharSequence, and the scope is reduced
 32      */
            public void reduction(String str) {
                     System.out.println("son : " + str);
                 }
           public void enlarge(CharSequence str){
                    System.out.println("son : " + str);
                 }
 }

