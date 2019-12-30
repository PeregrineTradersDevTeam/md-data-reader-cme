from functools import reduce

def sample_collection_from_test_files_old(spark, files_indices):
    def sel_indices(indices):
        def sel(rr):
            r, i = rr
            return i in set(indices)
        return sel

    def sel_first(rs):
        return list(map(lambda k: k[0], rs))

    return \
        sel_first(
        spark.read.parquet(files_indices[0][0]).rdd.zipWithIndex().filter(sel_indices(files_indices[0][1])).collect() +
        spark.read.parquet(files_indices[1][0]).rdd.zipWithIndex().filter(sel_indices(files_indices[1][1])).collect())


def sample_collection_from_test_files(spark, files_indices):
    def sel_indices(indices):
        indices_set = set(indices)
        def sel(rr):
            return rr[1] in indices_set
        return sel

    def sel_first(rs):
        return list(map(lambda k: k[0], rs))
    
    def process_file_indices(file_indices):
        file, indices = file_indices
        return spark.read.parquet(file).rdd.zipWithIndex().filter(sel_indices(indices)).collect()
    
    return \
        sel_first(
        reduce(lambda x,y: x+y, 
               map(process_file_indices, files_indices)))


