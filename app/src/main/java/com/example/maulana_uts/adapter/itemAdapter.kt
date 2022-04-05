package com.example.maulana_uts.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.maulana_uts.R
import com.example.maulana_uts.data.dataSource

class itemAdapter :
    RecyclerView.Adapter<itemAdapter.ItemViewHolder>() {
        private val data = dataSource().dataIphone

        class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view) {
            val gambar : ImageView = view.findViewById(R.id.picture)
            val namaIphone : TextView = view.findViewById(R.id.iphone_name)
            val tahunKeluar : TextView = view.findViewById(R.id.tahun)
            val layar : TextView = view.findViewById(R.id.ukuran_layar)
            val memori : TextView = view.findViewById(R.id.ukuran_memori)
            val warnaIphone : TextView = view.findViewById(R.id.warna)
            val hargaIphone : TextView = view.findViewById(R.id.harga)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.list_item, parent, false)

            return ItemViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
            val item = data[position]
            holder.gambar.setImageResource(item.imageResourceId)
            holder.namaIphone.text = item.iphoneName
            holder.tahunKeluar.text = item.tahun
            holder.layar.text = item.ukuranLayar
            holder.memori.text = item.kapasitasMemori
            holder.warnaIphone.text = item.warna
            holder.hargaIphone.text = item.harga
        }

        override fun getItemCount() = data.size
}