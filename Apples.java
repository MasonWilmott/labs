//Mason Wilmott
class Apples {

	    private String type;
	    private double weight;
	    private double price;

	    // Define the valid types for easy checking
	    private static final String[] VALID_TYPES = {"Red Delicious", "Golden Delicious", "Gala", "Granny Smith"};

	    // --- Constructors ---

	    public Apples() {
	        // Default values
	        type = "Gala";
	        weight = 0.0;
	        price = 0.0;
	    }

	    public Apples(String type, double weight, double price) {
	        // Use mutators to validate and assign
	        setType(type);
	        setWeight(weight);
	        setPrice(price);
	    }

	    // --- Accessors (Getters) ---

	    public String getType() {
	        return type;
	    }

	    public double getWeight() {
	        return weight;
	    }

	    public double getPrice() {
	        return price;
	    }

	    // --- Mutators (Setters) ---

	    public void setType(String newType) {
	        boolean isValid = false;
	        if (newType != null) {
	            for (String validType : VALID_TYPES) {
	                if (validType.equals(newType)) {
	                    isValid = true;
	                    break;
	                }
	            }
	        }

	        if (isValid) {
	            this.type = newType;
	        } else {
	            // Set to default if invalid or null
	            this.type = "Gala";
	        }
	    }

	    public void setWeight(double newWeight) {
	        // Weight must be between 0.0 and 2.0 inclusive
	        if (newWeight >= 0.0 && newWeight <= 2.0) {
	            this.weight = newWeight;
	        } else {
	            // Set to default if invalid
	            this.weight = 0.0;
	        }
	    }

	    public void setPrice(double newPrice) {
	        // Price must be non-negative
	        if (newPrice >= 0.0) {
	            this.price = newPrice;
	        } else {
	            // Set to default if invalid
	            this.price = 0.0;
	        }
	    }

	    // --- Special Methods ---

	    @Override
	    public String toString() {
	        return "Type: " + type + " Weight: " + weight + " Price: " + price;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj) {
	            return true;
	        }
	        if (obj == null || getClass() != obj.getClass()) {
	            return false;
	        }

	        Apples otherApple = (Apples) obj;

	        // Check if all instance variables match
	        return Double.compare(otherApple.weight, weight) == 0 &&
	               Double.compare(otherApple.price, price) == 0 &&
	               type.equals(otherApple.type);
	    }
	}

