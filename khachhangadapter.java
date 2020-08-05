package tdc.edu.doancanhan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
//import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;


public class khachhangadapter extends ArrayAdapter <infor>{
    Context context;
    int resource;
    ArrayList <infor> dskhachhang;
    int index = -1;

    public int getIndex() {
        return index;
    }

    public khachhangadapter(Context context, int resource, ArrayList <infor> dskhachhang) {
        super(context, resource, dskhachhang);
        this.context= context;
        this.resource=resource;
        this.dskhachhang=dskhachhang;
    }

    @Override
    public int getCount() {
        return dskhachhang.size();
    }


    @Override
    public infor getItem(int index) {
        return super.getItem(index);
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public View getView(final int position,  View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.khachhangadapter,parent,false);

        TextView tvSP_KH = convertView.findViewById(R.id.tvSP_KH);
        TextView tvKH_SP = convertView.findViewById(R.id.tvKH_SP);
        TextView hoten= convertView.findViewById(R.id.tvHoten);
        TextView diachi = convertView.findViewById(R.id.tvDiachi);
        ImageView imghinhanh = convertView.findViewById(R.id.imghinhanh);
        ImageButton btnxoa = convertView.findViewById(R.id.imgbtnxoa);
        Button btnThoat = convertView.findViewById(R.id.btnthoat);
        ImageButton btnedit = convertView.findViewById(R.id.imgbtnchinhsua);


        final infor infor = dskhachhang.get(position);

        tvSP_KH.setText(infor.getSanpham());
        tvKH_SP.setText(infor.getKhachhang()+"");
        hoten.setText("Họ Tên : " +infor.getHoten());
        diachi.setText("Địa Chỉ : "+infor.getDiachi()+"");

        String khachhang = infor.getKhachhang();

        switch (khachhang){
            case "KH01":
                imghinhanh.setImageResource(R.drawable.ic_motorcycle_black_24dp);
                break;
            case "KH02":

                break;
            default:

        }

        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dskhachhang.remove(position);
                notifyDataSetChanged();
            }
        });
        btnedit.setOnClickListener(new View.OnClickListener() {
            infor infor = dskhachhang.get(position);
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,chinhsuaactivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("KH",infor.getKhachhang());
                bundle.putString("SP",infor.getSanpham());
                bundle.putString("HoTen",infor.getHoten());
                bundle.putString("DiaChi",infor.getDiachi());
                intent.putExtras(bundle);
                ContextCompat.startActivity(context,intent,bundle);
            }
        });
        return  convertView;
    }
}
