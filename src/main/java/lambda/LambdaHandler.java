package lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Object, String> {


    @Override
    public String handleRequest(Object input, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Lambda is starting");

        return "Hello World";
    }
}