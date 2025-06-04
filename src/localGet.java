package PACKAGE_NAME;

public class localGet {
        static void technoGet(String path) {
            String filePath = path; // Replace with the actual path
            ArrayList<ArrayList<Integer>> x = new ArrayList<>();
            x.add(new ArrayList<Integer>());
            int whileLoop =0;
            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Process each line here
                    x.get(0).add(0, 3);
                    for (int i = 0; i < ; i++) {
                        
                    }
                    System.out.println(line);
                }
            } catch (IOException e) {
                // Handle exceptions like file not found or permission issues
                e.printStackTrace();
            }
        }
    }


    //get 1 year opr

    //get 3 year opr

    //get 236 data 1

    //get 236 data 2

    //get 236 data auto

    //get 236 data defence




