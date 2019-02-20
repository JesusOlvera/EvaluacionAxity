package olveraavilaantonio.com.evalucionaxity.Rest;

import olveraavilaantonio.com.evalucionaxity.Config.Url;
import olveraavilaantonio.com.evalucionaxity.Object.Producto;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST(Url.GETSKUS)
    Call<Producto> getProducto(    @Field(Url.IDPRODUCTO) String idProducto,
                                   @Field(Url.UPC) String ucp,
                                   @Field(Url.SKUID) String skuid);
}
