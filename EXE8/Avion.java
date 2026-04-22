package EXE8;

class Avion implements Volant {

        private int altitude;
        private int nbPassagers;

        @Override
        public void voler() {
            System.out.println("L'avion décolle ");
        }

        @Override
        public void atterrir() {
            System.out.println("L'avion atterrit");
            altitude = 0;
        }

        @Override
        public void changerAltitude(int altitude) {
            this.altitude = altitude;
            System.out.println("Nouvelle altitude (avion) : " + altitude);
        }


        public void embarquerPassagers(int nb) {
            nbPassagers += nb;
            System.out.println(nb + " passagers embarqués");
        }

        public void afficherAltitude() {
            System.out.println("Altitude actuelle : " + altitude);
        }
    }
