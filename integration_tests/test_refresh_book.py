# (sqlContext.parallelize(range(0, 10)).count())

def run_test(sparkSession):
    dataset = sparkSession.read.parquet('/test_decoded_data/test-1-md-incremental-refresh-book46.parquet')
    print(dataset.dtypes)
    print(sparkSession)
