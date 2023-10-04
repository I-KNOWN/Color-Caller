package com.themecolor.callerphone.wallpaper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bumptech.glide.Glide
import com.themecolor.callerphone.wallpaper.databinding.AllthemesItemLayoutBinding
import com.themecolor.callerphone.wallpaper.keyboardutils.isVisible
import com.themecolor.callerphone.wallpaper.models.ThemesModel

class FavAdapter(
    private val onThemeClicked: (ThemesModel, Int) -> Unit
) : ListAdapter<ThemesModel, RecyclerView.ViewHolder>(ItemFavDiffCallback()) {

//    private var listNativeAd: NativeAd? = null
//    private var themesList = mutableListOf<ThemesModel>()


    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {


        return ItemViewHolder(
                    AllthemesItemLayoutBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    ), onThemeClicked
                )

        }



    override fun getItemViewType(position: Int): Int {
        return if (currentList[position].isNativeAd) 1
        else
            0
    }


//    override fun onBindViewHolder(
//        holder: RecyclerView.ViewHolder,
//        position: Int,
//        payloads: MutableList<Any>
//    ) {
//        if (holder is ItemViewHolder) {
//            if (payloads.isEmpty())
//                super.onBindViewHolder(holder, position, payloads)
//            else {
//                if (payloads[0] == true) {
//                    holder.bindThemeState(currentList[position].themeIsSelected)
//                }
//            }
//        } else {
//            super.onBindViewHolder(holder, position, payloads)
//        }
//    }


    fun handleSelection(oldId: Int, newId: Int) {

        if (oldId > 0) {
            if (!currentList.isNullOrEmpty()) {
                val itemOld: List<ThemesModel> = currentList.filter { it.themeId == oldId }
                if (!itemOld.isNullOrEmpty()) {
                    val index = currentList.indexOf(itemOld[0])
                    currentList[index].themeIsSelected = false
                    notifyItemChanged(index)
                }
                val itemNew: List<ThemesModel> = currentList.filter { it.themeId == newId }
                if (!itemNew.isNullOrEmpty()) {
                    val index = currentList.indexOf(itemNew[0])
                    currentList[index].themeIsSelected = true
                    notifyItemChanged(index)
                }
            }
        }

    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {


        when (holder) {
            is ItemViewHolder -> {


                holder.bind(currentList[position])
                val layoutParams =
                    holder.itemView.layoutParams as StaggeredGridLayoutManager.LayoutParams
                layoutParams.isFullSpan = false
            }
         /*   is AdViewHolder -> {


                holder.bind()
                val layoutParams =
                    holder.itemView.layoutParams as StaggeredGridLayoutManager.LayoutParams
                layoutParams.isFullSpan = true
            }*/
        }

    }


    inner class ItemViewHolder(
        private val themeItemBinding: AllthemesItemLayoutBinding,
        private val onThemeClicked: (ThemesModel, Int) -> Unit
    ) : RecyclerView.ViewHolder(themeItemBinding.root) {

        private var currentTheme: ThemesModel? = null


        init {


            themeItemBinding.root.setOnClickListener {

                currentTheme?.let {

                    onThemeClicked.invoke(it, adapterPosition)

                }

            }

        }

        fun bind(item: ThemesModel) {
            this.currentTheme = item
            currentTheme?.let {

                if (!it.isNeon!!) {
                    if (it.themeId == 1)
                        themeItemBinding.themeIvLayer2.isVisible(false)
                    else
                        themeItemBinding.themeIvLayer2.isVisible(true)
                    setUpImages(it.themeDrawableName!!)
                    setUpNeonKeysImages(it.keysBgName!!)

                } else {
                    themeItemBinding.themeIvLayer2.isVisible(true)
                    setUpImages(it.themeDrawableName!!)
                    setUpNeonKeysImages(it.keysBgName!!)
                }
                bindThemeState(it.themeIsSelected)

            }

        }


        private fun setUpImages(drawableName: String) {
//            var requestOptions = RequestOptions()
//            requestOptions = requestOptions.transforms(FitCenter(), RoundedCorners(12))

            val drawableId = themeItemBinding.root.context.resources.getIdentifier(
                drawableName,
                "drawable",
                themeItemBinding.root.context.packageName
            )

            Glide.with(themeItemBinding.root)
                .load(drawableId)
                .into(themeItemBinding.themeIv)


//                .diskCacheStrategy(com.bumptech.glide.load.engine.DiskCacheStrategy.NONE)
//                .skipMemoryCache(true)
        }


        private fun setUpNeonKeysImages(drawableNameKeys: String) {
            val drawableId = themeItemBinding.root.context.resources.getIdentifier(
                drawableNameKeys,
                "drawable",
                themeItemBinding.root.context.packageName
            )

            Glide.with(themeItemBinding.root)
                .load(drawableId)
                .into(themeItemBinding.themeIvLayer2)
        }

        private fun bindThemeState(isThemeSelected: Boolean) {
            themeItemBinding.themeSelectedIv.isVisible(isThemeSelected)
            if (isThemeSelected) {
                themeItemBinding.themeIv.alpha = 0.5F
            } else {
                themeItemBinding.themeIv.alpha = 1.0F
            }
        }
    }
/*
    inner class AdViewHolder(private val mBinding: ListNativeadLayoutBinding) :
        RecyclerView.ViewHolder(mBinding.root) {

        fun bind() {
            mBinding.apply {

                val adView = (root.context as MainActivity).layoutInflater.inflate(
                    R.layout.list_large_adlayout,
                    listAdlayoutContainer,
                    false
                ) as NativeAdView

                listNativeAd?.let {
                    populateNativeAdView(it, adView)
                    this.adFrameLayout.removeAllViews()
                    this.adFrameLayout.addView(adView)
                }
            }
        }
    }*/

    override fun getItemId(position: Int): Long {
        return currentList[position].themeId.toLong()
    }

//    fun setList(list: List<ThemesModel>) {
//        themesList.clear()
//        themesList.addAll(list)
//    }

/*
    fun sendNativeAd(nativeAd: NativeAd) {
        this.listNativeAd = nativeAd
    }
*/


//    fun insertAdInFavItem() {
//        listNativeAd?.let {
//            var adID = 0
//            var adIndex = 4
//            if (themesList.isNotEmpty() && themesList.size >= adIndex) {
//                var numberOfAds = 2
//                while (themesList.size >= adIndex && numberOfAds > 0) {
//                    val adModel =
//                        ThemesModel(
//                            0,
//                            0,
//                            --adID,
//                            "",
//                            "",
//                            "",
//                            isNeon = false,
//                            themeIsSelected = false,
//                            true
//                        )
//                    if (!themesList.contains(adModel)) {
//                        themesList.add(adIndex, adModel)
//                        notifyItemInserted(adIndex)
//                    }
//                    --numberOfAds
//                    adIndex += 4 + 1
//                }
//                submitList(themesList)
////                notifyDataSetChanged()
//            }
//        }
//    }

}




class ItemFavDiffCallback : DiffUtil.ItemCallback<ThemesModel>() {
    override fun areItemsTheSame(oldItem: ThemesModel, newItem: ThemesModel): Boolean {
        return oldItem.themeId == newItem.themeId
    }

    override fun areContentsTheSame(oldItem: ThemesModel, newItem: ThemesModel): Boolean {
        return oldItem == newItem
    }

    override fun getChangePayload(oldItem: ThemesModel, newItem: ThemesModel): Any {
        return oldItem.themeIsSelected != newItem.themeIsSelected
    }
}



