import pandas as pd

#Leetcode 2879: Display The First Three Rows

def selectFirstRows(employees: pd.DataFrame) -> pd.DataFrame:
    return employees.head(3)
