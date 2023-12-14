package Exercise;

public class CoffeeMachine {
        private int waterLevel; // Nível de água na máquina
        private int coffeeBeansLevel; // Nível de grãos de café na máquina

        public void coffeeMachine() {
            this.waterLevel = 0;
            this.coffeeBeansLevel = 0;
        }

        public void addWater(int amount) {
            this.waterLevel += amount;
        }

        public void addCoffeeBeans(int amount) {
            this.coffeeBeansLevel += amount;
        }

        public void makeCoffee() {
            if (waterLevel >= 1 && coffeeBeansLevel >= 1) {
                System.out.println("Fazendo café... Café pronto!");
                waterLevel--;
                coffeeBeansLevel--;
            } else {
                System.out.println("Não há água ou grãos de café suficientes para fazer café.");
            }
        }

        public static void main(String[] args) {
            CoffeeMachine myMachine = new CoffeeMachine();

            myMachine.addWater(3);
            myMachine.addCoffeeBeans(2);

            myMachine.makeCoffee(); // Faz café
            myMachine.makeCoffee(); // Tenta fazer mais café (sem água suficiente)
        }
    }