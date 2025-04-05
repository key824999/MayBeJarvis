package mey.be.jarvis.maybejarvis.service;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class MathService {
    @Tool(description = "Get square root of a number")
    public double sqrt(double num) {
        return Math.sqrt(num);
    }

    @Tool(description = "Get square of a number")
    public double square(double num) {
        return Math.pow(num, 2);
    }

    @Tool(description = "Get number to the power of n")
    public double pow(double num, double n) {
        return Math.pow(num, 2);
    }
}
