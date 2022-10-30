package ru.kpfu.itis



object Repository {

    private var firstCursor: Int = 1

    var secondCursor: Int = 4
        private set

    private val listRandomItems: List<DataModel> = listOf(
        DataModel.FirstType(
            100,
            "Most listened",
            "6 tracks - 17 minutes",
            "https://vk.com/music/album/-2000594115_16594115_cb7818da65423b4cbc"
        ),
        DataModel.SecondType(101, "Child", R.drawable.ic_outline_child_care_24),
        DataModel.ThirdType(102,
            "HATTORI",
            "6 tracks",
            "https://sun2.ufanet.userapi.com/impf/wpVxuGAZV3ItESy681IpYLT9UuNt5xainEruLw/j10IeDal8cE.jpg?size=300x0&quality=90&sign=dd0ce4a3e26d536ec60b49db9fd0a9dc", false
        ),
    )
    fun getDataList(): List<DataModel> {
        return mutableDataList
    }


    private val mutableDataList: MutableList<DataModel> = mutableListOf(
        DataModel.FirstType(1,
            "My favorites",
            "5 tracks - \u0020 17 minutes",
            "https://images-cdn.9gag.com/photo/aLgzdqA_700b.jpg"
        ),

        DataModel.SecondType(2,"Tracks", R.drawable.ic_baseline_audiotrack_24),
        DataModel.SecondType(3,"Albums", R.drawable.ic_baseline_album_24),
        DataModel.SecondType(4,"Downloaded", R.drawable.ic_outline_download_24),


        DataModel.ThirdType(5,
            "Reibu",
            "8 tracks",
            "https://sun2.ufanet.userapi.com/impf/oecXOs_LzLeOlmz5ILs572NSYbd-vqKWV3dDdA/Pd9NXlqr-nE.jpg?size=300x0&quality=90&sign=99ea3855e4b49f7fc6ffb1e51aba3e33",true
        ),
        DataModel.ThirdType(6,
            "Stumpwork",
            "11 tracks",
            "https://sun2.ufanet.userapi.com/impf/8Tq_2pvEJY-dOYUZgWDgFLjSS9HMBp9GzXj3yg/Wm9gl41t2DM.jpg?size=300x0&quality=90&sign=1c4c23197e84fe331c0817948678faa0", false
        )
    )

    fun addRandomItem(): Int {
        var position = 0
        when (val item = getRandomItem()) {
            is DataModel.FirstType -> {
                position = (0..firstCursor).random()
                item.id = (mutableDataList.size..Integer.MAX_VALUE).random()

                mutableDataList.add(position, item)
                firstCursor++
                secondCursor++
            }
            is DataModel.SecondType -> {
                position = (firstCursor..secondCursor).random()
                item.id = (mutableDataList.size..Integer.MAX_VALUE).random()

                mutableDataList.add(position, item)
                secondCursor++
            }
            is DataModel.ThirdType -> {
                position = (secondCursor until mutableDataList.size).random()
                item.id = (mutableDataList.size..Integer.MAX_VALUE).random()
                mutableDataList.add(position, item)
            }
        }
        return position
    }

    private fun getRandomItem(): DataModel {
        val item =  listRandomItems[(0..2).random()]
        return item
    }
}