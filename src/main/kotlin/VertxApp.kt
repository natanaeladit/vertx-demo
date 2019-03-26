import io.vertx.core.Vertx

object VertxApp {

    @JvmStatic
    fun main(args: Array<String>) {
        val vertx = Vertx.vertx()

        var server = vertx.createHttpServer()
        server.requestHandler({ request ->
            // This handler gets called for each request that arrives on the server
            var response = request.response()
            response.putHeader("content-type", "text/plain")

            // Write to the response and end it
            response.end("Hello World!")
        })

        server.listen(8888)
    }

}