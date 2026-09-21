class Demo {

    public static void main(String[] args) {

      

        int[] indiaRuns = {
            8, 12, 5, 10, 7,
            9, 11, 6, 8, 13,
            5, 7, 12, 9, 6,
            10, 8, 11, 7, 14
        };

        int[] newZealandRuns = {
            6, 9, 8, 7, 10,
            5, 12, 6, 9, 8,
            7, 10, 5, 8, 9,
            6, 7, 11, 6, 10
        };



        int[] indiaPrefix = new int[20];
        int[] newZealandPrefix = new int[20];


  
        indiaPrefix[0] = indiaRuns[0];
        newZealandPrefix[0] = newZealandRuns[0];


       
        for (int i = 1; i < 20; i++) {

            indiaPrefix[i] =
                    indiaPrefix[i - 1] + indiaRuns[i];

            newZealandPrefix[i] =
                    newZealandPrefix[i - 1] + newZealandRuns[i];
        }



        System.out.println();
        System.out.println("==============================================");
        System.out.println("              T20 CRICKET MATCH");
        System.out.println("==============================================");

        System.out.printf(
                "%-6s %-10s %-12s %-10s %-10s%n",
                "Over",
                "IND Runs",
                "IND Score",
                "NZ Runs",
                "NZ Score"
        );

        System.out.println("----------------------------------------------");


  
        for (int i = 0; i < 20; i++) {

            System.out.printf(
                    "%-6d %-10d %-12d %-10d %-10d%n",
                    (i + 1),
                    indiaRuns[i],
                    indiaPrefix[i],
                    newZealandRuns[i],
                    newZealandPrefix[i]
            );
        }


     
        int indiaScore =
                indiaPrefix[indiaPrefix.length - 1];

        int newZealandScore =
                newZealandPrefix[newZealandPrefix.length - 1];


        System.out.println();
        System.out.println("==============================================");
        System.out.println("                 FINAL SCORE");
        System.out.println("==============================================");

        System.out.printf(
                "%-15s : %d/20 overs%n",
                "INDIA",
                indiaScore
        );

        System.out.printf(
                "%-15s : %d/20 overs%n",
                "NEW ZEALAND",
                newZealandScore
        );



        int indiaPoints;
        int newZealandPoints;


        if (indiaScore > newZealandScore) {

            indiaPoints = 2;
            newZealandPoints = 0;

            System.out.println();
            System.out.println("🏆 INDIA WON!");

        }

        else if (newZealandScore > indiaScore) {

            indiaPoints = 0;
            newZealandPoints = 2;

            System.out.println();
            System.out.println("🏆 NEW ZEALAND WON!");

        }

        else {

            indiaPoints = 1;
            newZealandPoints = 1;

            System.out.println();
            System.out.println("🤝 MATCH DRAW!");

        }



        System.out.println();
        System.out.println("==============================================");
        System.out.println("                 POINTS TABLE");
        System.out.println("==============================================");

        System.out.printf(
                "%-15s %-10s%n",
                "Team",
                "Points"
        );

        System.out.println("----------------------------------------------");

        System.out.printf(
                "%-15s %-10d%n",
                "India",
                indiaPoints
        );

        System.out.printf(
                "%-15s %-10d%n",
                "New Zealand",
                newZealandPoints
        );

        System.out.println("==============================================");
    }
}