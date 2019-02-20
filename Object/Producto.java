package olveraavilaantonio.com.evalucionaxity.Object;

import com.google.gson.annotations.SerializedName;

public class Producto {
    @SerializedName("skuDisplayNameText")
    public String nombre;
    @SerializedName("department")
    public String departemento;
    @SerializedName("skuId")
    public String codigo;
    @SerializedName("basePrice")
    public String precio;
}
