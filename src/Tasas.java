import java.util.Map;

public record Tasas(String base_code,
                    Map<String, Double> conversion_rates) {
}
