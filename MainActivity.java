package olveraavilaantonio.com.evalucionaxity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import olveraavilaantonio.com.evalucionaxity.Object.Producto;
import olveraavilaantonio.com.evalucionaxity.Rest.ApiClient;
import olveraavilaantonio.com.evalucionaxity.Rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiInterface = ApiClient.getClient(getBaseContext()).create(ApiInterface.class);
        CosumirServicio();

    }
    public void CosumirServicio(){
        Call<Producto> obtenerProducto = apiInterface.getProducto("0000009999",
                "00750129560012","00750129560012");
        obtenerProducto.enqueue(new Callback<Producto>() {
            @Override
            public void onResponse(Call<Producto> call, Response<Producto> response) {
response.isSuccessful();
            }

            @Override
            public void onFailure(Call<Producto> call, Throwable t) {

            }
        });
    }
}
