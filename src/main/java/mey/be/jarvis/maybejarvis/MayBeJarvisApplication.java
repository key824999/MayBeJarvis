package mey.be.jarvis.maybejarvis;

import mey.be.jarvis.maybejarvis.service.MathService;
import org.springframework.ai.tool.ToolCallbackProvider;
import org.springframework.ai.tool.method.MethodToolCallbackProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Set;

@SpringBootApplication
public class MayBeJarvisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MayBeJarvisApplication.class, args);
	}


	@Bean
	public ToolCallbackProvider tools(MathService mathService) {
		Set<Object> toolObjectList = Set.of(mathService);

		return  MethodToolCallbackProvider.builder()
				.toolObjects(toolObjectList)
				.build();
	}
}
