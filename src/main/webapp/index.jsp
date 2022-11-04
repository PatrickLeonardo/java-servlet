<html>
    <body>
        <h2>Hello World!</h2>

        <a href="./servidor">server</a><hr>
        
        <form id="form">
            <label for="nome">Nome: </label>
            <input type="name" name="nome"><br>
            <br>
            <label for="cpf">CPF: </label>
            <input type="cpf" name="cpf"><br>
            <br>
            <input type="reset" value="Limpar">
            <input type="submit" value="Enviar"><hr>
        </form>

        <script src="jquery.js"></script>
        <script type="text/javascript">

            $.ajax({
                method: "GET",
                url: "./servidor",
                success: (data) => {
                    $('body').append(data + "<br>")
                },
                error: (err) => {
                    $('body').append(err)
                }
            })
            
            $('#form').submit( function(event) {
                $.ajax({
                    url: "./servidor", 
                    method: 'POST',
                    data: $('#form').serialize(),
                    success: (data) => {
                        $('body').append(data)
                    },
                    error: (error) => {
                        $('body').append(error)
                    }
                });
                event.preventDefault()
            });

        </script>
    </body>
</html>
